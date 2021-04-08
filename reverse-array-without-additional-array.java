//Q-Write a java program to reverse an array without using an additional array?
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements:\t");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter Elements:");
        int i,j,temp=0;
        
        for(i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        
        System.out.println("Input Array:");
        for(i=0;i<array.length;i++){
            System.out.print(array[i]+", ");
        }
        
       for(i=0;i<n/2;i++){
            
               
                temp=array[i];
                array[i]=array[n-1-i];
                array[n-1-i]=temp;
               
        } 
        System.out.println("\nReversed Array:");
        for(i=0;i<array.length;i++){
            System.out.print(array[i]+", ");
        }
    }
}
