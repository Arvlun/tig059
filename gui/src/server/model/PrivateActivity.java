
package server.model;

public class PrivateActivity extends Activity {
    
    String name;
    String assistance;
    
    public PrivateActivity(String act, String date, String time, String staff, String phone, String loc, String adress, String name, String ass) {
        super(act, date, time, staff, phone, loc, adress);
        assistance = ass;
        this.name = name;
    }
    
    public PrivateActivity(int id, String act, String date, String time, String staff, String phone, String loc, String adress, String name, String ass) {
        super(id, act, date, time, staff, phone, loc, adress);
        assistance = ass;
        this.name = name;
    }
      
    public String getAssistance() {
        return assistance;
    }
       
    public String getName() {
        return name;
    }
      
    @Override
    public String toString() {
        String ret = String.format("Id: %d - Aktivitet: %s - Namn: %s - Datum: %s, Tid: %s - Ansvarig: %s, Tel: %s - Plats: %s, Adress: %s - Assistans: %s", id, activity, name, date, time, staff, phone, location, adress, assistance);
        return ret;
    }
 
}
