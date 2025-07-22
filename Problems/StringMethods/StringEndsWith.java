import java.util.*;

class StringEndsWith{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter File name");
        String fileName = sc.nextLine();
        if(fileName.endsWith(".mp3")){
        System.out.println("Valid Extension : " +fileName.endsWith(".mp3"));
            
        }
        else{
            System.out.println("Invalid format");
        }
    }
}