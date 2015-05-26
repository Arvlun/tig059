
package server.model;


public class Registration {
    
    String name;
    String assistance;
    
    public Registration(String name, String ass) {
        this.name = name;
        assistance = ass;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAssistance() {
        return assistance;
    }
    
    @Override
    public String toString() {
        return (name + ", Hjälp: " + assistance);
    }
}
