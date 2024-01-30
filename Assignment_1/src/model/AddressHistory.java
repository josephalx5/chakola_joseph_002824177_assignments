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
public class AddressHistory {
    private final ArrayList<Address> addressList;

    public AddressHistory() {
        this.addressList = new ArrayList<>();
    }
    
    public void addAddress(Address address){
        addressList.add(address);
    }
    public ArrayList<Address> getAddressList(){
        return addressList;
    }
    public void deleteAddress(int index){
        addressList.remove(index);
    }
    public Address getAddress(int index){
        return addressList.get(index);
    }
}
