
/* JFM1T4_Assignment5:
   Write a program to print the following pattern:
       a
     a b a
   a b c b a
     a b a
       a
*/



import java.util.Scanner;
public class DiamondPattern
{
    public static void main(String args[]) 
    {
        int i,j,k,m;
        char ch=97;
        for (i = 0; i <= 2; i++) 
        {
            for (m=i; m<=4 ; m++) 
            {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) 
            {
                System.out.print((char)(ch+j)+"");                
            }
           for(k=i-1;k>=0;k--)
             {
                System.out.print((char)(ch+k)+"");
             }
           System.out.println();
        }
          for (i=1;i>=0;i--) 
        {
            for (m=i;m<=4;m++) 
            {
                System.out.print(" ");
            }
          for(j=0;j<=i;j++)
            {
              System.out.print((char)(ch+j)+"");
            }
          for(k=i-1;k>=0;k--)
            {
              System.out.print((char)(ch+k)+"");
            }
            System.out.println("");
        }
    }
}
