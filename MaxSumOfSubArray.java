import java.util.*;


class MaxSumOfSubArray{
static void FindMaxSum(int a[],int k ,int minSum){
    for(int i = 0 ;i<a.length;i++){
        for(int j = i ; j<a.length-k;j++){
minSum=minSum+a[j];
        }
        System.out.println(minSum);

    }
}   
    public static void main(String []args)

{
    int a[]={10,20,30,40,50};
    int k = 3;
    int minSum = 0;
   // int maxSum = -1;
    FindMaxSum(a,k,minSum);
}}