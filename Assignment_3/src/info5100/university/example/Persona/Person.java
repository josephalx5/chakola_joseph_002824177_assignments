/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

/**
 *
 * @author kal bugrara
 */
public class Person {
    
    String id;
    RoleManager role;
    public Person (String id){
        
        this.id = id;
    }
    public Person(String id, RoleManager role){
        this.id = id;
        this.role = role;
    }
    public String getPersonId(){
        return id;
    }

        public boolean isMatch(String id){
            return getPersonId().equals(id);
        }
    
}
