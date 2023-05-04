import java.util.Scanner;
public class arraySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Array elements are:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean temp=false;
        System.out.println("Enter the searching element");
        int x=sc.nextInt();
         for(int i=0;i<n;i++)
         {
             if(x==arr[i]){
             System.out.println("element found at index"+ i);
             temp=true;
             }
            }
         if(temp==false)
         System.out.println("element not found");
        }
    }










    
    

