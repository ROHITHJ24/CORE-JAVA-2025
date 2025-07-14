import java.util.*;
//ConstructorOverloading
class Calculation{
 
    Calculation(int a,int b){
        int sum = a+b;
        System.out.println("Sum is : "+sum);
    }
    Calculation(int c,int d,int e){
     
        int diff = c-d-e;
        System.out.println("Difference is : "+diff);
    }
    Calculation(int c,int d,float e){
     
        float div = c+d/e;
        System.out.println("Division is : "+div);
    }
    
    Calculation(int c,int d,int e,int f){
      
        int multi= c*d*e*f;
        System.out.println("Multiplication is : "+multi);
    }

}
class ConstructorOverloading{
    public static void main(String [] args){
        Calculation sum = new Calculation (10,10);
        Calculation diff = new Calculation (10,10,10);
        Calculation div = new Calculation (10,10,2.0f);
        Calculation mult = new Calculation (2,2,2,2);
    }
}