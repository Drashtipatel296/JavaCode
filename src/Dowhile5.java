import java.util.Scanner;

public class Dowhile5
{
    public static void main(String[] args)
    {
        byte n;
        byte x=1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        n = input.nextByte();

        do
        {
            System.out.println(x);
            x+=2;
        }
        while(x<=n);
    }
}
