import java.util.Scanner;

public class Userinfo
{
    public static void main(String[] args)
    {
        String name;
        byte age;
        long phone;
        String edu;
        String fn;
        String mn;
        long bd;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        name = input.nextLine();

        System.out.println("Enter your age : ");
        age = input.nextByte();

        System.out.println("Enter phone number : ");
        phone = input.nextLong();

        System.out.println("Enter your education : ");
        edu = input.next();

        System.out.println("Enter your father name : ");
        fn = input.next();

        System.out.println("Enter your mother name : ");
        mn = input.next();

        System.out.println("Enter your birth date : ");
        bd = input.nextLong();




    }
}
