/* 1
   1 2
   1 2 3 
   1 2 3 4 
   */

public class Pattern4
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            int x=1;
            for(int j=0;j<i;j++)
            {
                System.out.print(x+" ");
                x++;

            }
            System.out.println();
        }
    }
}