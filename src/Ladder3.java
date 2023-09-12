import java.util.Scanner;

public class Ladder3
{
    public static void main(String[] args)
    {
        byte a;
        byte b;
        byte c;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        a = input.nextByte();
        System.out.print("Enter the value of b : ");
        b = input.nextByte();
        System.out.print("Enter the value of c : ");
        c = input.nextByte();

        if(a>b && a>c)
        {
            System.out.println("a is maximum");
        }
        else if(b>a && b>c)
        {
            System.out.println("b is maximum");
        }
        else
        {
            System.out.println("c is maximum");
        }
    }
}
