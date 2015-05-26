
package server.model;

//import java.util.ArrayList;

public class Activity {
    
    int id = -1;
    String activity;
    String date;
    String time;
    String staff;
    String phone;
    String location;
    String adress;
    
    public Activity(String act, String date, String time, String staff, String phone, String loc, String adress) {
        activity = act;
        this.date = date;
        this.time = time;
        this.staff = staff;
        this.phone = phone;
        location = loc;
        this.adress = adress;
    }
    
    public Activity(int id, String act, String date, String time, String staff, String phone, String loc, String adress) {
        this.id = id;
        activity = act;
        this.date = date;
        this.time = time;
        this.staff = staff;
        this.phone = phone;
        location = loc;
        this.adress = adress;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }
    
    public String getTime() {
        return time;
    }
    
    public String getActivity() {
        return activity;
    }
    
    public String getStaff() {
        return staff;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getLocation() {
        return location;
    }
    
    public String getAdress() {
        return adress;
    }
    
    @Override
    public String toString() {
        String ret = String.format("Id: %d - Aktivitet: %s - Datum: %s, Tid: %s - Ansvarig: %s, Tel: %s - Plats: %s, Adress/Avdelning: %s", id, activity, date, time, staff, phone, location, adress);
        return ret;
    };
    
}
