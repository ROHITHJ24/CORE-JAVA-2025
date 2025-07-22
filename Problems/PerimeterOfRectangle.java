import java.util.*;

abstract class Perimeter{
    abstract void FindPerimeter(Scanner scn); //scanner scn is used to take input from the user
}

class Values extends Perimeter{
    void FindPerimeter(Scanner scn){ //Scanner scn is used to take input from the user
        System.out.println("Enter The Length of Rectangle");
        int length=scn.nextInt();
        System.out.println("Enter the Breadth of Rectangle");
int breadth = scn.nextInt();
int perimeter = 2*(length*breadth); //formula
        System.out.println("Perimeter of Rectangle is: " + perimeter);
    }
}
class PerimeterOfRectangle{
public static void main(String args[]){
    Values obj = new Values();
Scanner scn = new Scanner(System.in);
obj.FindPerimeter(scn); //scn is passed to the method FindPerimeter
scn.close();
}
}
