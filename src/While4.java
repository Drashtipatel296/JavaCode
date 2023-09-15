import java.util.Scanner;

public class While4
{
    public static void main(String[] args)
    {
        short num;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value : ");
        num = input.nextShort();

        short x = 1;

        while (x<=num)
        {
            System.out.println(x);
            x++;
        }
    }
}
