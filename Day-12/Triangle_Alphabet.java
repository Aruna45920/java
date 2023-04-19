class Triangle_Alphabet
{
    public static void main(String args[])
    {
        int n=6;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            System.out.print(" ");
            char start='A';
            for(int k=1;k<=i;k++)
            System.out.print(start+++" ");
            System.out.println();
            
        }
    }
}