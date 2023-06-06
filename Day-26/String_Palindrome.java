import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String word=sc.nextLine();
        String rev="";
        for(int i=word.length()-1;i>=0;i--) {
            rev+=word.charAt(i);
        }
        if(rev.equals(word))
            System.out.println("Palindrome");
        else
            System.out.println("not a palindrome");
    }
}
