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
public class PersonHistory {
    private final ArrayList<Person> personList;
    
    public PersonHistory(){
        this.personList = new ArrayList<>();
    }
    public void addPerson(Person person){
        personList.add(person);
    }
    public void deletePerson(int index){
        personList.remove(index);
    }
    public ArrayList<Person> getPersons(){
        return personList;
    }
    public Person getPerson(int index){
        return personList.get(index);
    }
      
}
