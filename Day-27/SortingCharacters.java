import java.util.Arrays;
public class SortingCharacters {
    public static void main(String[] args) {
        String s="java";
        char temp;
        char s1[]=s.toCharArray();
        int len=s1.length;
        for(int i=0;i<len;i++) {
            for(int j=i+1;j<len;j++) {
                if(s1[i]>s1[j]) {
                    temp=s1[i];
                    s1[i]=s1[j];
                    s1[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(s1));
    }
    
}
