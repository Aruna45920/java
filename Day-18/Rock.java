class Constructor1 {
    String name;
    public Constructor1() {
        name="java";
    }
    
}
class Rock {
    public static void main(String[] args) {
        Constructor1 c1=new Constructor1();
        System.out.println("Constructor name is="+ c1.name);
        
    }
}
