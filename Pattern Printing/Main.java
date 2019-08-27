import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int r,c,i,j;
       Scanner p=new Scanner(System.in);
       r=p.nextInt();
       c=p.nextInt();
      for( i = 1; i <=r; i++) 
{ 
 
for(j = c; j >c-i; j--) 
{ 
System.out.print(j); 
} 
for(int k = 1; k <= c- i; k++) 
{
System.out.print(c-i+1);
}
System.out.println();
}

    }
}