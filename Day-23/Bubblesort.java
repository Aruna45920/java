import java.util.Arrays;
public class Bubblesort {
    public static void main(String[] args) {
        int arr[]={4,1,6,8,3};
        int len=arr.length;
        for(int i=0;i<len;i++) {
            for(int j=0;j<len-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
