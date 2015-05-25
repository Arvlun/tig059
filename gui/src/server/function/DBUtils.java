package server.function;

import java.sql.*;
import java.util.*;

public class DBUtils{
    private static Connection c;
    static{
        try{
            Class.forName("org.sqlite.JDBC");
        }catch(Exception e){
            System.err.println("Fatal: " + e.getMessage());
            System.exit(-1);
        }
        System.out.println("Loaded driver.");
        try{
            c = DriverManager.getConnection("jdbc:sqlite:actdb");// Must exist in "current directory"         
        }catch(Exception e){
            System.err.println("Error getting database connection: "+e.getMessage());
            c=null;
        }
    }
    private static void reconnect(){
        try{
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
        }catch(Exception e){
            System.err.println("Error reconnecting to DB: " + e.getMessage());
        }
    }
    private static Statement newStatement(){
        // Try-with-resources - if exception occurs, stm will be automatically closed.
        try(Statement stm = c.createStatement()){
            if(c==null||c.isClosed()){
                reconnect();
                return c.createStatement();
            }
            return stm;
        }catch(Exception e){
            System.err.println("Error getting statement: " + e.getMessage());
            return null;
        }
    }
    /*
        // Create two statements as a String[]
        String[] sqls = {"INSERT INTO funktion(id, role) VALUES(998, 0)", "INSERT INTO funktion(id, role) VALUES(999, 2)"};
        
        // DBUtils.executeUpdates(String) returns an int[] with
        // the number of rows updated for each statement in the batch.
        for(int i : DBUtils.executeUpdates(sqls) ){
            System.out.println("Updated "+i+" row(s)");
        }
     */
    public static int[] executeUpdates(ArrayList<String> sqls){
        try{
            Statement stmt = newStatement();
            for (String sql : sqls){
                stmt.addBatch(sql);
            }
            return stmt.executeBatch();
        }catch(Exception e){
            System.err.println("Error executing batch of updates: " + e.getMessage());
            return null;
        }
    }
    public static int executeUpdate(String sql){
        try{
            return newStatement().executeUpdate(sql);
        }catch(Exception e){
            System.err.println("Error executing update: "+e.getMessage());
            return -1;
        }
    }
    public static ResultSet executeQuery(String sql){
        try{
            return newStatement().executeQuery(sql);
        }catch(Exception e){
            System.err.println("Error executing query: " + e.getMessage());         
            return null;
        }
    }
    
    public static void testDB() {
        try {
            Statement st = newStatement();
            String sq = "SELECT * FROM activity";
            ResultSet rs = executeQuery(sq);
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            while (rs.next()){
		Vector<Object> rowData = new Vector<Object>();
		for (int i = 1;i <= columnCount; i++) {
                    rowData.add(rs.getObject(i));
		}
		System.out.println(rowData);
	
            } 
        } catch (Exception e) {
            System.out.println("FEL" + e.getMessage());
        }
    }
}
