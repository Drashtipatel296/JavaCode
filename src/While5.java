import java.util.Scanner;

public class While5
{
       public static void main(String[] args)
       {
           byte n;

           Scanner input = new Scanner(System.in);

           System.out.print("Enter the value : ");
           n = input.nextByte();

           byte x = 1;

           while(x<=n)
           {
               if(x%2==1)
               {
                   System.out.println(x);
               }
               else
               {
                   System.out.println( );
               }
               x++;
           }
       }
}
