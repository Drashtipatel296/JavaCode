import java.util.Scanner;

public class Swap1
{
    public static void main(String[] args)
    {
        int x;
        int y;
        int k;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value : ");
        x = input.nextInt();

        System.out.println("Enter the value : ");
        y = input.nextInt();

        k = x;
        x = y;
        y = k;

        System.out.println("after swapping = "+x);
        System.out.println("after swapping = "+y);
    }
}
