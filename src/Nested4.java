import java.util.Scanner;

public class Nested4
{
    public static void main(String[] args)
    {
        byte a;
        byte b;
        byte c;
        byte d;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        a = input.nextByte();
        System.out.print("Enter the value of b : ");
        b = input.nextByte();
        System.out.print("Enter the value of c : ");
        c = input.nextByte();
        System.out.print("Enter the value of d : ");
        d = input.nextByte();

        if(a>b)
        {
            if(a>c)
            {
                if(a>d)
                {
                    System.out.println("a is maximum");
                }
                else
                {
                    System.out.println("d is maximum");
                }
            }
        }
        else
        {
            if (b > c)
            {
                if (b > d)
                {
                    System.out.println("b is maximum");
                } else
                {
                    System.out.println("d is maximum");
                }
            }
            else
            {
                if(c>d)
                {
                    System.out.println("c is maximum");
                }

            }

        }
    }
}
