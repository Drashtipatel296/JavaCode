import java.util.Scanner;

public class Formula2
{
    public static void main(String[] args)
    {
        int x;
        int y;
        int z;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of x : ");
        x = input.nextInt();
        System.out.print("Enter the value of y : ");
        y = input.nextByte();

        z = (x*x) - (2*x*y) - (y*y);

        System.out.println("Answer is = "+z);
    }
}
