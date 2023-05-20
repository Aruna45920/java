public class FirstRepeatingElement {
    public static void main(String[] args) {
        int arr[]={3,4,4,6,7,8};
        int len=arr.length;
        for(int i=0;i<len;i++) {
            for(int j=i+1;j<len;j++) {
                if(arr[j]==arr[i]) {
                    System.out.println(arr[i]);
                    return;
                }
                
            }
        }
        
    }
    
}
