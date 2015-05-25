
import gui.*;
import server.model.*;
import server.function.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arvid
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(System.getProperty("user.dir"));
        //DBUtils db = new DBUtils();
        //db.testDB();
        //GroupActivity ga = new GroupActivity("Tjurfäktning","2015-05-22","15:02","Klara","031-030707","Madrid","Tjurgatan 25", 15000, 20);
        //GroupActivity ga2 = new GroupActivity("Dykning","2015-05-22","15:55","Lawrence Fishburne","031-889900","Bali","Dykaregatan 23", 24000, 8);
        //VisitActivity va = new VisitActivity("U2 Konsert","2015-08-23","23:00","Bono","0707070707","A3", "3 timmar");
        //PrivateActivity pa = new PrivateActivity("Rättegång","2015-06-03","12:00","Erin Brockovich","0708070807","Herpderp","Nånstansgatan 23", "Walter White", "Juridisk assistans");
        
        //ActivityDB.saveActivity(ga2);
        //ActivityDB.saveActivity(ga2);
        //ActivityDB.saveActivity(va);
        //ActivityDB.saveActivity(pa);
        //System.out.println(ActivityDB.getNextAvailableId());
        
        MainFrame mf = new MainFrame();
        StartFrame st = new StartFrame();
        GroupActivityPanel gPanel = new GroupActivityPanel();
        VisitActivityPanel vPanel = new VisitActivityPanel();
        PrivateActivityPanel pPanel = new PrivateActivityPanel();
        ListActivityPanel lPanel = new ListActivityPanel();
        Controller ctrl = new Controller(mf, st, gPanel, vPanel, pPanel, lPanel);

        //ctrl.appStart();
        mf.setContentPane(st);
        mf.pack();
        mf.setVisible(true);
    }
    
}
