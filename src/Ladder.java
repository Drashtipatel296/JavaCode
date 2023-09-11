import java.sql.SQLOutput;
import java.util.Scanner;

public class Ladder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        byte a;
        System.out.println("Enter the value : ");
        a = input.nextByte();
        System.out.println("a");

        if(a>0)
        {
            System.out.println("a is positive");
        }
        else if(a<0)
        {
            System.out.println("a is negative");
        }
        else
        {
            System.out.println("a is neutral");
        }
    }
}
