public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={2,3,5,7,11,13};
        int low=0;
        int end=arr.length-1;
        int n=7;
        while(low<=end) {
           int mid=(low+end)/2;
            if(arr[mid]==n) {
                System.out.println("Element found");
                break;
            }
                else if(arr[mid]>n) {
                end=mid-1;
                }
            
            else if(arr[mid]<n) {
                low=mid+1;
            }
            
        }
    }
    
}
