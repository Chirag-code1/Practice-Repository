//Q-Write a java program to count occurrences of each element in an array?*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements in your array:\t");
        int n=sc.nextInt();
        int array[]=new int[n];
        int freq[]=new int[n];
        System.out.println("Enter Elements:");
        int i,j,count=0;
        for(i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        for(i=0;i<array.length;i++){
            count=1;
            for(j=i+1;j<freq.length;j++){
                if(array[i]==array[j]){
                    count++;
                    freq[j]=-1;
                }
            }
            
            if(freq[i]!=-1){
                freq[i]=count;
            }
        }
        
        for(i=0;i<freq.length;i++)
        {
            if(freq[i]!=-1){
                System.out.println("___________________________");
                System.out.println(array[i]+" appeared "+freq[i]+" times.");
            }
        }
    }

}
