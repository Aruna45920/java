public class MissingElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7,8};
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int arrsum=0;
        for(int i=0;i<arr.length;i++) {
            arrsum+=arr[i];
        }
        int MissingElement=sum-arrsum;
        System.out.println("Missing number from array:" + MissingElement);


    }
    
}
