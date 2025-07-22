import java.util.*;

class StringIndexOf{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter email");
        String Email = sc.nextLine();
        int indexValue = Email.indexOf('@');
        if(indexValue != -1){  
            System.out.println("Valid mail id Good to go");
        } 
        else{

            System.out.println("Invalid mail id ");
        }
    }
}