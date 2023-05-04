import java.util.Scanner;
public class arrayMerge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first array");
        int n=sc.nextInt();
        System.out.println("enter the second array");
        int m=sc.nextInt();
        int k=n+m;
        int[] A=new int[n];
        int[] B=new int[m];
        int[] C=new int[k];
        System.out.println("enter "+n+" values for array A");
        for(int i=0;i<n;i++)
        A[i]=sc.nextInt();
        System.out.println("enter "+m+" values for array B");
        for(int i=0;i<m;i++)
        B[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        C[i]=A[i];
        for(int i=0;i<m;i++)
        C[n+i]=B[i];
        System.out.println("merged array is");
        for(int i=0;i<k;i++)
        System.out.println(C[i]+" ");


    }

    
}
