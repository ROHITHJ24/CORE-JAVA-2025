
import java.util.*;


class SubArrayFinder{
    static void findSubArray(int [] a){
for(int i = 0 ; i <a.length;i++){
for(int j = i ;j<a.length;j++){
    for(int k = i;k<j+1;k++){
    System.out.print(a[k]+" "); //K is tprint the array
        }
    System.out.println();
    }
}

    }
public static void main(String [] args){
    int []a={1,2,3,4,5};
    findSubArray(a);
}
}
