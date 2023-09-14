import java.util.Scanner;

public class Formula5
{
      public static void main(String[] args)
      {
            int x;
            int y;
            int z;
            int a;

            Scanner input = new Scanner(System.in);

            System.out.print("Enter the value of x : ");
            x = input.nextInt();
            System.out.print("Enter the value of y : ");
            y = input.nextByte();
            System.out.print("Enter the value of z : ");
            z = input.nextByte();

            a = (x*x) + (y*y) + (z*z) + (2*(x*y)+(y*z)+(z*x));

            System.out.println("Answer is = "+a);

      }
}
