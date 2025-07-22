
class CountChar {

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
// String s=scan.nextLine();
        String s = "aabcccccaa";
      int count =1;
        for (int i = 0; i < s.length()-1; i++) {
    if(s.charAt(i)!=s.charAt(i+1)){
        count++;
         System.out.print(s.charAt(i)+""+count);
       
       }
      
        }
        }
    }

