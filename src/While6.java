import java.util.Scanner;

public class While6
{
    public static void main(String[] args)
    {
        byte n;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value : ");
        n = input.nextByte();

        byte x = 100;

        while (x >= n)
        {
            if (x % 2 == 0)
            {
                System.out.println(x);
            } else
            {
                System.out.println();
            }
            x--;
        }
    }
}
