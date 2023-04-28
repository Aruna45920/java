public class Datatype
{
    public static void main(String args[])
    {
        System.out.println(Short.SIZE);
// now the results in bits format if you need bytes format divide it by 8
        System.out.println(Character.SIZE/8); 
 // now we find the range of the number data type
 // it having 2 types MIN_VALUE and MAX_VALUE
         byte b=127;
         int i=6867569;
         System.out.println(Byte.MIN_VALUE);
         System.out.println(Byte.MAX_VALUE);
         System.out.println(Integer.MIN_VALUE);
         System.out.println(Integer.MAX_VALUE);
        
    }
}