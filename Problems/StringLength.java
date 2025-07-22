import java.util.*;
//STRING LENGTH
//int len = Mobile.length();

class StringLength{
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter mobile number");
    String Mobile = sc.nextLine();
    int len = Mobile.length();
    String firstNumber = Mobile.substring(0,1);
    if(len== 10 && firstNumber.equals("9")){
        System.out.println("Valid mobile number");
    }
    else if(firstNumber!=("9")){
        System.out.println("Invalid mobile number ,\n Number should start with 9");

    }
}
}