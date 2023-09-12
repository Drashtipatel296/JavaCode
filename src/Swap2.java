import java.util.Scanner;

public class Swap2
{
    public static void main(String[] args)
    {
          byte x;
          byte y;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value : ");
        x = input.nextByte();

        System.out.println("Enter the value : ");
        y = input.nextByte();

        x = (byte) (x + y);
        y = (byte) (x - y);
        x = (byte) (x - y);

        System.out.println("After swapping = "+x);
        System.out.println("After swapping = "+y);

    }
}
