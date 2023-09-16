import java.util.Scanner;

public class While9
{
    public static void main(String[] args)
    {
        byte x = 1;
        byte n;
        byte fac = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value : ");
        n = input.nextByte();

        while(x<=n)
        {
            fac = (byte) (fac * x);
            x++;


        }
        System.out.println(fac);
    }
}
