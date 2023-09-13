import java.util.Scanner;

public class Ladder5
{
    public static void main(String[] args)
    {
        byte a;
        byte b;
        byte c;
        byte d;
        byte e;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        a = input.nextByte();
        System.out.print("Enter the value of b : ");
        b = input.nextByte();
        System.out.print("Enter the value of c : ");
        c = input.nextByte();
        System.out.print("Enter the value of d : ");
        d = input.nextByte();
        System.out.print("Enter the value of e : ");
        e = input.nextByte();

        if(a>b && a>c && a>d && a>e)
        {
            System.out.println("a is maximum");
        }
        else if(b>a && b>c && b>d && b>e)
        {
            System.out.println("b is maximum");
        }
        else if(c>a && c>b && c>d && c>e)
        {
            System.out.println("c is maximum");
        }
        else if(d>a && d>b && d>c && d>e)
        {
            System.out.println("d is maximum");
        }
        else
        {
            System.out.println("e is maximum");
        }
    }
}
