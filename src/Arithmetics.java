import java.util.Scanner;

public class Arithmetics
{
    public static void main(String[] args)
    {

        byte a;
        byte b;
        int sum;
        int sub;
        int multiply;
        int div;
        int mod;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        a = input.nextByte();

        System.out.println("Enter the value of b : ");
        b = input.nextByte();


        sum = a + b;
        sub = a - b;
        multiply = a * b;
        div = a / b;
        mod = a % b;


        System.out.println("sum = " + (a + b));
        System.out.println("sub = " + (a - b));
        System.out.println("multiply = " + (a * b));
        System.out.println("div = " + (a / b));
        System.out.println("mod = " + (a % b));
    }
}
