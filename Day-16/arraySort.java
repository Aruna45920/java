import java.util.Scanner;
public class arraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++) {
        arr[i]=sc.nextInt();
        }
        int temp=0;
        System.out.println("Sorting order is");
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
            if(arr[i]>arr[j]){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            } 
        }
    
           System.out.println(arr[i]); 
        }


        


        
    }
    
}
