//hierarchial inheritence

import java.util.*;

class Account{
    void showBalance(){
        System.out.println("Accout blnce");
    }
}
class Savings extends  Account{
    void showBalance(){
        System.out.println("Savings Account balance");
    }
}
class Current extends  Account{
    void showBalance(){
        System.out.println("Current Account balance");
    }
}
class HierarchialInheritence{
    public static void main(String[] args){
Current cu = new Current();
cu.showBalance(); 
cu.showBalance();
    }
}