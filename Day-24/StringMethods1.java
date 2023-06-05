public class StringMethods1 {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        for(int i=0;i<1000000000;i++) {
            String s="Aruna";
            String s1="Sanju";
            String s2="Sanju";
            String s3="Reddi";
            String s4="Reddi";
            String s5="Sanju";
            String s6="Sanju";
        }
            long end=System.currentTimeMillis();
        
        System.out.println(end-start);
        start=System.currentTimeMillis();
        for(int i=0;i<1000000000;i++) {
            String s=new String("Aruna");
            String s1=new String("Sanju");
            String s2=new String("Sanju");
            String s3=new String("Reddi");
            String s4=new String("Reddi");
            String s5=new String("Sanju");
            String s6=new String("Sanju");
        }
            end=System.currentTimeMillis();
        
        System.out.println(end-start);
















            
        }
    }
    

