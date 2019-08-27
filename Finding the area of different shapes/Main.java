import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        int a,l,b,r,ch ;
      // System.out.println("Enter your choice\n"+"1.Square\n"+"2.Rectangle\n"+"3.Triangle\n"+"4.Circle\n");
       Scanner p=new Scanner(System.in);
      ch=p.nextInt();
      switch(ch)
      {
          case 1:
              r=p.nextInt();
              a=r*r;
              System.out.println(a);
              break;
        case 2:
            r=p.nextInt();
            l=p.nextInt();
            a=r*l;
            System.out.println(a);
              break;
              case 3:
                  l=p.nextInt();
                   b=p.nextInt();
                  a=(l*b)/2;
                  System.out.println(a);
              break;
              case 4:
                  r=p.nextInt();
                  double c=3.14*r*r;
                    System.out.println(c);
              break;
              default:  System.out.println("invalid");
              break;
      }
    }
}