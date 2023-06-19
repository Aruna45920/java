public class ArithmeticProgression {
    public static void main(String[] args) {
        int arr[]={2,4,6,8};// the array is in AP
        //int arr[]={3,6,7,9};// not in AP
        int diff=arr[0]-arr[1];
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]-arr[i+1]!=diff) {
                System.out.println("The array is not in arithmetuc progression");
                return;
            }
        }
        System.out.println("The array is in arithmetic progression");
    }
    
}
