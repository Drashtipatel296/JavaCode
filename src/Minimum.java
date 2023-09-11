import java.util.Scanner;

public class Minimum
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        byte a;
        System.out.println("Enter the value : ");
        a = input.nextByte();
        System.out.println(a);

        byte b;
        System.out.println("Enter the value : ");
        b = input.nextByte();
        System.out.println(b);

        if(a < b)
        {
            System.out.println("a is minimum");
        }
        else
        {
            System.out.println("b is minimum");
        }

    }
}
