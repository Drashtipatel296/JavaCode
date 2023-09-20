import java.util.Scanner;

public class Dowhile4
{
    public static void main(String[] args)
    {
        byte x = 1;
        byte n;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        n = input.nextByte();

        do
        {
            System.out.println(x);
            x--;
        }
        while(n>=x);
    }
}
