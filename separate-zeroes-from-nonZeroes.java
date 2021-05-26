//Q1- Write a java program to separate zeros from non-zeros in an integer array?

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
        
       
       int pos=0;
      for(i=0;i<n;i++){
          if(array[i]!=0){
              array[pos]=array[i];
              pos++;
          }
      }
      
      while(pos<array.length){
          array[pos]=0;
          pos++;
     }
      
      System.out.println("Array with separated Zeroes:\n");
      for(i=0;i<n;i++){
          System.out.print(array[i]);
      }     
    }
}
