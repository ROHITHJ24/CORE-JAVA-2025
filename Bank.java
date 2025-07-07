import java.util.*;

abstract class RBI {
    abstract void rateOfInterest(Scanner scn);
}

class SBI extends RBI {
    void rateOfInterest(Scanner scn) {
        System.out.println("SBI Bank Rate of Interest");
        System.out.println("Enter Amount ");
        int P = scn.nextInt();
        System.out.println("Principle " + P);
        System.out.println("Enter Rate of Interest ");
        int R = scn.nextInt();
        System.out.println("Rate of Interest " + R);    
        System.out.println("Enter Time in Years ");
        int T = scn.nextInt();
        int total = (P*R*T)/100;
        System.out.println("Total " + total);
    }
}

class Axcess extends RBI {
    void rateOfInterest(Scanner scn) {
        System.out.println("Axcess Bank Rate of Interest");
        System.out.println("Enter Amount ");
        int P = scn.nextInt();
        System.out.println("Principle " + P);
        System.out.println("Enter Rate of Interest ");
        int R = scn.nextInt();
        System.out.println("Rate of Interest " + R);    
        System.out.println("Enter Time in Years ");
        int T = scn.nextInt();
        int total = (P*R*T)/100;
        System.out.println("Total " + total);
    }
}

class Bank {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        SBI sbi = new SBI();
        Axcess axcess = new Axcess();
        sbi.rateOfInterest(scn);
        axcess.rateOfInterest(scn);
        scn.close();
    }
}
