import java.util.Scanner;
public class arrayAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements into the array");
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum/n);

    }
    
}
