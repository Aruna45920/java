public class Constructor {
    int i;
    private Constructor() {
        i=5;
        System.out.println("constructor is");
    }
    public static void main(String[] args) {
        Constructor c = new Constructor();
        System.out.println("value of i: " +c.i);
    }
    
}
