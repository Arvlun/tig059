
package server.model;

import java.util.ArrayList;

public class VisitActivity extends Activity {
    
    String duration;
    
    public VisitActivity(String act, String date, String time, String staff, String phone, String avdelning, String dur) {
        super(act, date, time, staff, phone, "Baldurs Hage", avdelning);
        duration = dur;
    }
    
    public VisitActivity(int id, String act, String date, String time, String staff, String phone, String avdelning, String dur) {
        super(id , act, date, time, staff, phone, "Baldurs Hage", avdelning);
        duration = dur;
    }
      
    public String getDuration() {
        return duration;
    }
         
    @Override
    public String toString() {
        String ret = String.format("Id: %d - Aktivitet: %s - Datum: %s, Tid: %s - Ansvarig: %s, Tel: %s - Avdelning: %s - Varaktighet: %s", id, activity, date, time, staff, phone, adress, duration);
        return ret;
    }

}
