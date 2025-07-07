import java.util.*;

abstract class Area {
    abstract void FindArea(Scanner scn);
}

class Circle extends Area {
    void FindArea(Scanner scn) {
        System.out.println("Enter the radius :");
        int radius = scn.nextInt();
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle is :" + area);
    }
}

class AreaOfCircle {
    public static void main(String arg[]) {
        Circle circle = new Circle();
        Scanner scn = new Scanner(System.in);
        circle.FindArea(scn);
        scn.close();
    }
}