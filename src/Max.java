import java.util.Scanner;

public class Max
{
    public static void main(String[] args)
    {
        byte a;
        byte b;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        a = input.nextByte();

        System.out.print("Enter the value of b : ");
        b = input.nextByte();

        if(a>b)
        {
            System.out.println("a is maximum");
        }
        else
        {
            System.out.println("b is maximum");
        }
    }
}
