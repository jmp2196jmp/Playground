import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner p = new Scanner(System.in);
        String str1 = p.nextLine();
        String str2 = p.nextLine();
        int no_of_parts = p.nextInt();
        String str3 = str1.replace(str1, str2);
        String arr[] = str3.split(" ",no_of_parts);
        for(String s: arr)
        System.out.println(s);
    }
}