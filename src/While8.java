import java.util.Scanner;

public class While8
{
    public static void main(String[] args)
    {
        byte x = 1;
        byte n;
        byte sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value : ");
        n = input.nextByte();

        while(x<=n)
        {
            sum = (byte) (sum + x);
            x++;


        }
        System.out.println(sum);
    }
}
