import javax.sound.sampled.SourceDataLine;

public class PrintNumbers {
    public static void main(String[] args) {
        int n=10;
        display(n);
    }
    static void display(int n) {
    if(n==0)
    return;
    System.out.println(n--);
    display(n);
    
}
}
