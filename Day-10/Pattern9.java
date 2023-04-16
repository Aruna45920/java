/*
5 
5 4       
5 4 3     
5 4 3 2   
5 4 3 2 1 
*/
class Pattern9
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=(n-i+1);j--)
            System.out.print(j+" ");
            System.out.println();
        }
    }
}