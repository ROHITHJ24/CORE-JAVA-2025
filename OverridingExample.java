//OverridingExample

import java.util.*;

class OverridingExample {

     void Add(int a, int b) {

        System.out.println("Sum : " + (a + b));
    }

    void Add(double a, double b) {
        System.out.println("Sum : " + (a + b));
    }

    void Add(String e, String f) {
        System.out.println(e + f);
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Enter two Double:");
        double c= scan.nextDouble();
        double d = scan.nextDouble();
        System.out.println("Enter str1:");
        String e = scan.next();
     scan.nextLine(); 
        System.out.println("Enter str2:");
        String f = scan.nextLine();

        OverridingExample obj = new OverridingExample();
        obj.Add(a, b);
        obj.Add(c, d);
        obj.Add(e, f);

    }
}
