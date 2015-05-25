/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.model;

/**
 *
 * @author Arvid
 */
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
