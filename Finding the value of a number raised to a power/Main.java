import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      int b,ex,r=1;
      Scanner p=new Scanner(System.in);
      b=p.nextInt();
      ex=p.nextInt();
      while(ex!=0)
      {
        r=r*b;
        --ex;
      }
       System.out.println(r); 
    }
}