import java.util.Scanner;

public class While10
{
    public static void main(String[] args)
    {
        int x = 1;
        int num;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value : ");
        num = input.nextInt();

        while(x<=10)
        {
            System.out.println(num +"*"+x+"="+ num * x);
            x++;
        }
    }
}
