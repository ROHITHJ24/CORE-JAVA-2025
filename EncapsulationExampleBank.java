/*EncapsulationExampleBank
Encapsulation: Create a BankAccount class with: * private fields: accountNumber, balance * 
methods: deposit(), withdraw(), getBalance() * prevent withdrawing more than balance
*/
import java.util.*;
public class EncapsulationExampleBank{
private int accountNumber;
private double balance;


public int getAccountNumber(){
    return accountNumber;
}
public void setAccountNumber(int accountNumber){
    this.accountNumber=accountNumber;
}
public double getBalance(){
    return balance;
}
public void setBalance(double balance){
    this.balance=balance;
}

public static void main(String[] args) {
 EncapsulationExampleBank enc = new EncapsulationExampleBank();
 Scanner scn = new Scanner (System.in);
enc.setAccountNumber(701088349);
enc.setBalance(5000.00);
System.out.println("WELCOME TO JRM BANK");
System.out.println("Account Number: " + enc.getAccountNumber());

if(amount > enc.getBalance()){
    System.out.println("No sufficient Balance");
}

}
}