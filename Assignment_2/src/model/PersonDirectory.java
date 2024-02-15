/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author josephchakola
 */
public class PersonDirectory {
    
    
    private ArrayList<Person> directory;
    
    public PersonDirectory(){
        directory = new ArrayList<>();
        populate();
    }

    public ArrayList<Person> getDirectory() {
        return directory;
    }
    
    public void addPerson(Person person){
        directory.add(person);
    }
    
    public void deletePerson(int index){
        directory.remove(index);
    }
    
    public Person getPerson(int index){
        return directory.get(index);
    }
    
    public Person findPerson(String keyword){
        for(Person p: directory){
            if(p.getLastName().equals(keyword) || 
                    p.getFirstName().equals(keyword) || 
                    p.getHomeAddress().getStreetAddress().equals(keyword) ||
                p.getWorkAddress().getStreetAddress().equals(keyword)){
                return p;
            }
        }
        return null;
    }
    
    private void populate(){
       Person p = new Person();
       p.setFirstName("Joseph");
       p.setLastName("Chakola");
       p.setSSN("123-45-6789");
       p.setLiscenseNumber("123456");
         Address a = new Address();
            a.setStreetAddress("123 Main St");
            a.setUnitNumber("Apt 1");
            a.setCity("Boston");
            a.setState("MA");
         p.setHomeAddress(a);
        p.setWorkAddress(a);
        addPerson(p);

        p = new Person();
        p.setFirstName("John");
        p.setLastName("Doe");
        p.setSSN("987-65-4321");
        p.setLiscenseNumber("654321");
        a = new Address();
            a.setStreetAddress("456 Elm St");
            a.setUnitNumber("Apt 2");
            a.setCity("New York");
            a.setState("NY");
        p.setHomeAddress(a);
        p.setWorkAddress(a);
        addPerson(p);

        p = new Person();
        p.setFirstName("Jane");
        p.setLastName("Smith");
        p.setSSN("111-22-3333");
        p.setLiscenseNumber("111222");
        a = new Address();
            a.setStreetAddress("789 Oak St");
            a.setUnitNumber("Apt 3");
            a.setCity("Los Angeles");
            a.setState("CA");
        p.setHomeAddress(a);
        p.setWorkAddress(a);
        addPerson(p);

        p = new Person();
        p.setFirstName("James");
        p.setLastName("Johnson");
        p.setSSN("444-55-6666");
        p.setLiscenseNumber("444555");
        a = new Address();
            a.setStreetAddress("101 Pine St");
            a.setUnitNumber("Apt 4");
            a.setCity("Seattle");
            a.setState("WA");
        p.setHomeAddress(a);
        p.setWorkAddress(a);
        addPerson(p);

        p = new Person();
        p.setFirstName("Jill");
        p.setLastName("Jackson");
        p.setSSN("777-88-9999");
        p.setLiscenseNumber("777888");
        a = new Address();
            a.setStreetAddress("202 Cedar St");
            a.setUnitNumber("Apt 5");
            a.setCity("Portland");
            a.setState("OR");
        p.setHomeAddress(a);
        p.setWorkAddress(a);
        addPerson(p);
    }
}
