import java.util.*;

abstract class Employee {
    abstract void calculateSalary(Scanner scn);
}

class FullTime extends Employee {
    void calculateSalary(Scanner scn) {
        System.out.println("Enter the basic salary of Full Time Employee:");
        double basicSalary = scn.nextDouble();
        double PF = 0.12 * basicSalary; // PF
        System.out.println("Provident Fund (PF): " + PF);
    }
}
class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        FullTime ft = new FullTime();
        ft.calculateSalary(scn);
        scn.close();
    }
}