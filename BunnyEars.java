public class BunnyEars {
    public static void main(String[] args) {
        int bunnies=3;
        int total=bunnyEars(bunnies);
        System.out.println(total);
    }
    static int bunnyEars(int bunnies) {
        if(bunnies==0)
        return 0;
        return 2+bunnyEars(bunnies-1);
    }
    
}
