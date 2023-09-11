import java.util.Scanner;

public class Areaofcircle
{
    public static void main(String[] args)
    {
        double pie = 3.14;
        double area;
        int radius;

        Scanner input = new Scanner(System.in);

        System.out.println("The radius of circle is : ");
        radius = input.nextInt();

        area = (pie*radius*radius);

        System.out.println("The area of circle is = "+area);
    }
}
