import java.util.Scanner;

class b
{
    public static void main (String [] args)
     {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your number:");

        int a = obj.nextInt();
        int result = (a % 2 == 0) ? 10 : 20;
        System.out.println(result);
    }


}
