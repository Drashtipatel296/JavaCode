import java.util.Scanner;

public class Nested3
{
    public static void main(String[] args)
    {
        byte x;
        byte y;
        byte z;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of x : ");
        x = input.nextByte();
        System.out.print("Enter the value of y : ");
        y = input.nextByte();
        System.out.print("Enter the value of z : ");
        z = input.nextByte();

        if(x<y)
        {
            if(x<z)
            {
                System.out.println("x is minimum");
            }
            else {
                System.out.println("z is minimum");
            }
        }
        else
        {
            if(y<z)
            {
                System.out.println("y is minimum");
            }
            else
            {
                System.out.println("z is minimum");
            }
        }
    }
}
