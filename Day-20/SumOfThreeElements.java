public class SumOfThreeElements {
    public static void main(String[] args) {
        int arr[]={8,8,8,9,7,6};
         int target=24;
         for(int i=0;i<arr.length-2;i++) {
            for(int j=i+1;j<arr.length-1;j++) {
                for(int k=j+1;k<arr.length;k++) {
                    int sum=arr[i]+arr[j]+arr[k];
                    if(sum==target) {
                        System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]+"="+target);
                        return;
                    }
                }
            }
         }
         System.out.println("sum not found");
    }
    
}
