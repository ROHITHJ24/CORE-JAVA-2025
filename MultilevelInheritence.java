import java.util.*;

class A{
    void displayA(){
        System.out.println("From A");
    }
}
class B extends A{

    void displayB(){
        System.out.println("From B");
    }
}
class C extends B{

    void displayC(){
        System.out.println("From C");
    }
}

class MultilevelInheritence{
    public static void main(String[] args) {
        C c = new C();
        c.displayA(); multi
        c.displayB(); 
        c.displayC();
    }
}