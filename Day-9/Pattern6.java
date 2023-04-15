/*  6 
    6 5
    6 5 4
    6 5 4 3
    6 5 4 3 2
    6 5 4 3 2 1
*/
public class Pattern6
{
    public static void main(String args[])
    {
        int n=6;
        for(int i=1;i<=n;i++)
        {
            int start =n;
            for(int j=1;j<=i;j++)
            {
                System.out.print(start+" ");
                start--;
            }
            System.out.println();
            
        }
    }
}