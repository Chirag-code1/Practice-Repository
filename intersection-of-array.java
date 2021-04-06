//Write a java program to find the intersection of two arrays?
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements in ur Array:\t");
        int n1= sc.nextInt();
        int array1[]= new int[n1];
        
        
        System.out.println("Enter Elements in Array1:");
        int i,j,count=0;
        for(i=0;i<n1;i++){
            array1[i]=sc.nextInt();
        }
        System.out.print("Enter the number of elements in ur Array2:\t");
        int n2= sc.nextInt();
        int array2[]=new int[n2];
        
        
        
        System.out.println("Enter Elements in Array2:");
         for(i=0;i<n2;i++){
            array2[i]=sc.nextInt();
        }
        
      System.out.println("Intersections of Entered 2 Arrays:");
      
        for(i=0;i<n1;i++){
            for(j=0;j<n2;j++){
                
                if(array1[i]==array2[j]){
                   System.out.println(array1[i]+",");
                   count=1;
                
                }
            }
        }
        
        
       if(count!=1){
           System.out.println("No Intersection exists!");
       }
     
  
        
 }
}
