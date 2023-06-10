
import java.util.Arrays;
public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[]={8,9,7,10,5};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
        System.out.println(Arrays.toString(arr));
    }
    
}
