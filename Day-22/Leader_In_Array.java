public class Leader_In_Array {
    public static void main(String[] args) {
        int arr[]={16,15,5,4,1,2};
        int len=arr.length;
        int max=arr[len-1];
        for(int i=len-1;i>=0;i--) {
            if(arr[i]>=max) {
                max=arr[i];
                System.out.println(arr[i]+"\t");
            }
        }
    }
    
}
