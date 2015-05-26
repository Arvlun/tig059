
package server.model;

import java.util.ArrayList;

public class GroupActivity extends Activity {
    
    int cost;
    int spots;
    //ArrayList<String> registered = new ArrayList<String>();
    
    public GroupActivity(String act, String date, String time, String staff, String phone, String loc, String adress, int cost, int spots) {
        super(act, date, time, staff, phone, loc, adress);
        //this.adress = adress;
        this.cost = cost;
        this.spots = spots;
    }
    
    public GroupActivity(int id, String act, String date, String time, String staff, String phone, String loc, String adress, int cost, int spots) {
        super(id, act, date, time, staff, phone, loc, adress);
        //this.adress = adress;
        this.cost = cost;
        this.spots = spots;
    }
       
    public int getCost() {
        return cost;
    }
    
    public int getSpots() {
        return spots;
    }
      
    @Override
    public String toString() {
        String ret = String.format("Id: %d - Aktivitet: %s - Datum: %s, Tid: %s - Ansvarig: %s, Tel: %s - Plats: %s, Adress: %s - Kostnad: %d - Platser: %d", id, activity, date, time, staff, phone, location, adress, cost, spots);
        return ret;
    }

    
    
}
