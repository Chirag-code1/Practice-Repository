//Q-Write a java program to find a missing number in an integer array?

//Input: n=5
//Input elements: 1,2,4,5,0
//Outcome: Missing element:3

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements in Array:");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter Elements:");
        int i;
        for(i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        
        int ReqSum=n*(n+1)/2;
        int GettingSum=0;
        for(i=0;i<n;i++){
            GettingSum+=array[i];
        }
        int missing_num=ReqSum-GettingSum;
        System.out.println("Missing number is :\t"+missing_num);
        
    }
}
