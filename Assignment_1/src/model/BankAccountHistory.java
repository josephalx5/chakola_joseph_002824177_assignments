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
public class BankAccountHistory {
    
    private final ArrayList<BankAccount> bank;

    public BankAccountHistory() {
        this.bank = new ArrayList<>();
    }
    
    public ArrayList<BankAccount> getBankAccounts(){
        return bank;
    }
    public BankAccount getBankAccount(int index){
        return bank.get(index);
    }
    public void deleteBankAccount(int index){
        bank.remove(index);
    }
    public void addBankAccount(BankAccount bankAccount){
        bank.add(bankAccount);
    }
    
    
}
