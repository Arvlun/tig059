/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.function;

import server.model.*;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Arvid
 */
public class ActivityDB {
    
    //private static DBUtils db = new DBUtils();

    // type 0 = name, type 1 = date, type 2 = everything
    public static ArrayList<GroupActivity> getGroupActivitySearchResult(int type, String search) {
        String q;
        ArrayList<GroupActivity> list = null;
        
        if (type == 0) { //on name
            q = String.format("SELECT activity.id, activity, day, time, locname,"
                    + " adress, staffname, phone, cost, spots FROM activity, grpact,"
                    + " location, staff WHERE activity = '%s' AND activity.id = grpact.id"
                    + " AND activity.locid = location.locid AND activity.staffid = staff.staffid", search);
            ResultSet rs = DBUtils.executeQuery(q);
            list = createGroupActivity(rs);
        } else if (type == 1) { // on date
            q = String.format("SELECT activity.id, activity, day, time, locname,"
                    + " adress, staffname, phone, cost, spots FROM activity, grpact,"
                    + " location, staff WHERE day = '%s' AND activity.id = grpact.id"
                    + " AND activity.locid = location.locid AND activity.staffid = staff.staffid", search);
            ResultSet rs = DBUtils.executeQuery(q);
            list = createGroupActivity(rs);
        } else if (type == 2) { // on date
            q = String.format("SELECT activity.id, activity, day, time, locname,"
                    + " adress, staffname, phone, cost, spots FROM activity, grpact,"
                    + " location, staff WHERE activity.id = grpact.id"
                    + " AND activity.locid = location.locid AND activity.staffid = staff.staffid");
            ResultSet rs = DBUtils.executeQuery(q);
            list = createGroupActivity(rs);
        }
        return list;
    }
    
    public static ArrayList<VisitActivity> getVisitActivitySearchResult(int type, String search) {
        String q;
        ArrayList<VisitActivity> list = null;
        if (type == 0) {
            q = String.format("SELECT activity.id, activity, day, time, locname,"
                    + " adress as floor, staffname, phone, duration FROM activity, visact,"
                    + " location, staff WHERE activity = '%s' AND activity.id = visact.id"
                    + " AND activity.locid = location.locid AND activity.staffid = staff.staffid", search);
            ResultSet rs = DBUtils.executeQuery(q);
            list = createVisitActivity(rs);
        } else if (type == 1) {
            q = String.format("SELECT activity.id, activity, day, time, locname,"
                    + " adress as floor, staffname, phone, duration FROM activity, visact,"
                    + " location, staff WHERE day = '%s' AND activity.id = visact.id"
                    + " AND activity.locid = location.locid AND activity.staffid = staff.staffid", search);
            ResultSet rs = DBUtils.executeQuery(q);
            list = createVisitActivity(rs);
        } else if (type == 2) {
            q = String.format("SELECT activity.id, activity, day, time, locname,"
                    + " adress as floor, staffname, phone, duration FROM activity, visact,"
                    + " location, staff WHERE activity.id = visact.id"
                    + " AND activity.locid = location.locid AND activity.staffid = staff.staffid");
            ResultSet rs = DBUtils.executeQuery(q);
            list = createVisitActivity(rs);
        }
        return list;
    }
    
    public static ArrayList<PrivateActivity> getPrivateActivitySearchResult(int type, String search) {
        String q;
        ArrayList<PrivateActivity> list = null;
        if (type == 0) {
            q = String.format("SELECT activity.id, activity, day, time, locname,"
                    + " adress, staffname, phone, name, assistance FROM activity, privact,"
                    + " location, staff WHERE activity = '%s' AND activity.id = privact.id"
                    + " AND activity.locid = location.locid AND activity.staffid = staff.staffid", search);
            ResultSet rs = DBUtils.executeQuery(q);
            list = createPrivateActivity(rs);
        } else if (type == 1) {
            q = String.format("SELECT activity.id, activity, day, time, locname,"
                    + " adress, staffname, phone, name, assistance FROM activity, privact,"
                    + " location, staff WHERE day = '%s' AND activity.id = privact.id"
                    + " AND activity.locid = location.locid AND activity.staffid = staff.staffid", search);
            ResultSet rs = DBUtils.executeQuery(q);
            list = createPrivateActivity(rs);
        } else if (type == 2) {
            q = String.format("SELECT activity.id, activity, day, time, locname,"
                    + " adress, staffname, phone, name, assistance FROM activity, privact,"
                    + " location, staff WHERE activity.id = privact.id"
                    + " AND activity.locid = location.locid AND activity.staffid = staff.staffid");
            ResultSet rs = DBUtils.executeQuery(q);
            list = createPrivateActivity(rs);
        }
        return list;
    }
    
    public static ArrayList<Activity> getAllActivity() {
        String q;
        ArrayList<Activity> list = null;
        q = String.format("SELECT activity.id, activity, day, time, locname,"
                + " adress, staffname, phone FROM activity, "
                + " location, staff WHERE"
                + " activity.locid = location.locid AND activity.staffid = staff.staffid");
        ResultSet rs = DBUtils.executeQuery(q);
        list = createActivity(rs);
        return list;
    }
    
    public static ArrayList<Activity> createActivity(ResultSet rs) {
        ArrayList<Activity> list = new ArrayList<Activity>();
        //ResultSetMetaData meta = rs.getMetaData();
        try {
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String act = rs.getString("activity");
                String date = rs.getString("day");
                String time = rs.getString("time");
                String location = rs.getString("locname");
                String adress = rs.getString("adress");
                String staff = rs.getString("staffname");
                String phone = rs.getString("phone");
                Activity aa = new Activity(id, act, date, time, staff, phone, location, adress);
                list.add(aa);              
            }
            return list;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return list;
        }
    }
    
    public static ArrayList<GroupActivity> createGroupActivity(ResultSet rs) {
        ArrayList<GroupActivity> list = new ArrayList<GroupActivity>();
        //ResultSetMetaData meta = rs.getMetaData();
        try {
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String act = rs.getString("activity");
                String date = rs.getString("day");
                String time = rs.getString("time");
                String location = rs.getString("locname");
                String adress = rs.getString("adress");
                String staff = rs.getString("staffname");
                String phone = rs.getString("phone");
                Integer cost = rs.getInt("cost");
                Integer spots = rs.getInt("spots");
                GroupActivity ga = new GroupActivity(id, act, date, time, staff, phone, location, adress, cost, spots);
                list.add(ga);              
            }
            return list;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return list;
        }
    }
    
    public static ArrayList<PrivateActivity> createPrivateActivity(ResultSet rs) {
        ArrayList<PrivateActivity> list = new ArrayList<PrivateActivity>();
        //ResultSetMetaData meta = rs.getMetaData();
        try {
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String act = rs.getString("activity");
                String date = rs.getString("day");
                String time = rs.getString("time");
                String location = rs.getString("locname");
                String adress = rs.getString("adress");
                String staff = rs.getString("staffname");
                String phone = rs.getString("phone");
                String name = rs.getString("name");
                String assistance = rs.getString("assistance");
                PrivateActivity pa = new PrivateActivity(id, act, date, time, staff, phone, location, adress, name, assistance);
                list.add(pa);              
            }
            return list;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return list;
        }
    }
    
    public static ArrayList<VisitActivity> createVisitActivity(ResultSet rs) {
        ArrayList<VisitActivity> list = new ArrayList<VisitActivity>();
        //ResultSetMetaData meta = rs.getMetaData();
        try {
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String act = rs.getString("activity");
                String date = rs.getString("day");
                String time = rs.getString("time");
                //String location = rs.getString("locname");
                String floor = rs.getString("floor");
                String staff = rs.getString("staffname");
                String phone = rs.getString("phone");
                String duration = rs.getString("duration");
                VisitActivity va = new VisitActivity(id, act, date, time, staff, phone, floor, duration);
                list.add(va);              
            }
            return list;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return list;
        }
    }
    
    public static ArrayList<Registration> getRegisterList(int activityId) {
        ArrayList<Registration> list = new ArrayList<Registration>();
        String q = String.format("SELECT name, assistance FROM registered WHERE actid = %d", activityId);
        ResultSet rs = DBUtils.executeQuery(q);
        try {
            while (rs.next()) {
                String name = rs.getString("name");
                String ass = rs.getString("assistance");
                Registration reg = new Registration(name, ass);
                list.add(reg);
            }
            return list;
        } catch (SQLException se) {
           System.out.println(se.getMessage()); 
           return list;
        }
        
    }
    
    private static int getNextActivityId(){
        ResultSet rs = DBUtils.executeQuery("SELECT max(id) FROM activity");
        try{
            rs.next();
            return (rs.getInt(1)+1);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return -1;
        }
    }
    
    private static int getNextStaffId(){
        ResultSet rs = DBUtils.executeQuery("SELECT max(staffid) FROM staff");
        try{
            rs.next();
            return (rs.getInt(1)+1);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return -1;
        }
    }
    
    private static int getNextLocationId(){
        ResultSet rs = DBUtils.executeQuery("SELECT max(locid) FROM location");
        try{
            rs.next();
            return (rs.getInt(1)+1);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return -1;
        }
    }
    
    private static int checkStaffId(String name, String phone) {
        String q = String.format("SELECT staffid FROM staff WHERE staffname = '%s' AND phone = '%s'", name, phone);
        ResultSet rs = DBUtils.executeQuery(q);
        try {
            rs.next();
            int i = rs.getInt("staffid");
            System.out.println(i);
            return i;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }
    
    private static int checkLocationId(String locname, String adress) {
        String q = String.format("SELECT locid FROM location WHERE locname = '%s' AND adress = '%s'", locname, adress);
        ResultSet rs = DBUtils.executeQuery(q);
        try {
            rs.next();
            return rs.getInt("locid");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }
    
    private static String createLocationSQL(String locname, String adress, int id) {
        String sql = String.format("INSERT INTO location VALUES (%d, '%s', '%s')", id, locname, adress);
        return sql;
    }
    
    private static String createStaffSQL(String name, String phone, int id) {
        String sql = String.format("INSERT INTO staff VALUES (%d, '%s', '%s')", id, name, phone);
        return sql; 
    }
    
    public static void saveActivity(Activity a) {
        ArrayList<String> sqlArr = new ArrayList<String>();
        
        if (a.getId() < 0) {
            a.setId(getNextActivityId());
        }
        
        int staffid = checkStaffId(a.getStaff(), a.getPhone());
        int locid = checkLocationId(a.getLocation(), a.getAdress());
        
        if (locid < 0) {
            locid = getNextLocationId();
            String sqlLoc = createLocationSQL(a.getLocation(), a.getAdress(), locid);
            sqlArr.add(sqlLoc);
        } 
        if (staffid < 0) {
            staffid = getNextStaffId();
            String sqlStaff = createStaffSQL(a.getStaff(), a.getPhone(), staffid);
            sqlArr.add(sqlStaff);
        }

        String sqlAct = String.format("INSERT INTO activity VALUES (%d, '%s', '%s', '%s', %d, %d)", a.getId(), a.getActivity(), a.getDate(), a.getTime(), locid, staffid);
        sqlArr.add(sqlAct);
        
        if (a.getClass().getSimpleName().equals("GroupActivity")) {
            GroupActivity ga = (GroupActivity) a;
            String sqlGrpAct = String.format("INSERT INTO grpact VALUES (%d, %d, %d)", a.getId(), ga.getCost(), ga.getSpots());
            sqlArr.add(sqlGrpAct);
            DBUtils.executeUpdates(sqlArr);
        } else if (a.getClass().getSimpleName().equals("VisitActivity")) {
            VisitActivity va = (VisitActivity) a;
            String sqlVisAct = String.format("INSERT INTO visact VALUES (%d, '%s')", a.getId(), va.getDuration());
            sqlArr.add(sqlVisAct);
            DBUtils.executeUpdates(sqlArr);
        } else if (a.getClass().getSimpleName().equals("PrivateActivity")) {
            PrivateActivity pa = (PrivateActivity) a;
            String sqlPrivAct = String.format("INSERT INTO privact VALUES (%d, '%s', '%s')", a.getId(), pa.getName(), pa.getAssistance());
            sqlArr.add(sqlPrivAct);
            DBUtils.executeUpdates(sqlArr);
        } else {
            System.out.println(a);
            System.out.println("FEL");
        }
    }
    
    public static void removeActivity(Activity a) {
        ArrayList<String> sqlArr = new ArrayList<String>();
        String sqlAct = String.format("DELETE FROM activity WHERE id=%d", a.getId()); 
        sqlArr.add(sqlAct);
        
        if (a.getClass().getSimpleName().equals("GroupActivity")) {
            String sqlGrpAct = String.format("DELETE from grpact WHERE id=%d", a.getId());
            sqlArr.add(sqlGrpAct);
        } else if (a.getClass().getSimpleName().equals("VisitActivity")) {
            String sqlVisAct = String.format("DELETE from visact WHERE id=%d", a.getId());
            sqlArr.add(sqlVisAct);
        } else if (a.getClass().getSimpleName().equals("PrivateActivity")) {
            String sqlPrivAct = String.format("DELETE from privact WHERE id=%d", a.getId());
            sqlArr.add(sqlPrivAct);
        } else {
            System.out.println(a);
            System.out.println("FEL");
        }
        DBUtils.executeUpdates(sqlArr);
 
    }
    
    public static void updateActivity(Activity a) {
        removeActivity(a);
        saveActivity(a);
    }
    
    public static void registerResident(int id, Registration reg) {
        String sql = String.format("INSERT INTO registered VALUES (%d, '%s', '%s')", id, reg.getName(), reg.getAssistance());
        System.out.println(sql + " " + DBUtils.executeUpdate(sql));
    }
    
    public static void deregisterResident(int id, Registration reg) {
        String sql = String.format("DELETE FROM registered WHERE actid=%d AND name='%s'", id, reg.getName());
        System.out.println(sql + " " + DBUtils.executeUpdate(sql));
    }
    
}
