public class Three_Largest_Elements {
    public static void main(String[] args) {
        int arr[]={16,36,45,37,76};
        int len=arr.length;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        for(int i=0;i<len;i++) {
            if(arr[i]>max1) {
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max2) {
                max3=arr[i];
            }
        }
        System.out.println("First largest element="+max1);
        System.out.println("Second largest element="+max2);
        System.out.println("Third largest element="+max3);
    }
    
}
