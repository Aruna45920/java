/*
1 
1 2
1 2 3
1 2 3 4
1 2 3
1 2
1
*/

class Pattern8
{
    public static void main(String args[])
    {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print(j+" ");
            System.out.println();
        }
          for(int i=1;i<n;i++)
          {
            for(int j=1;j<=(n-i);j++)
            System.out.print(j+" ");
            System.out.println();
          }
    }
}