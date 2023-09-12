import java.util.Scanner;

public class Nested5
{
    public static void main(String[] args)
    {
        byte a;
        byte b;
        byte c;
        byte d;
        byte e;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        a = input.nextByte();
        System.out.print("Enter the value of b : ");
        b = input.nextByte();
        System.out.print("Enter the value of c : ");
        c = input.nextByte();
        System.out.print("Enter the value of d : ");
        d = input.nextByte();
        System.out.print("Enter the value of e : ");
        e = input.nextByte();

        if(a<b)
        {
             if(a<c)
             {
                 if(a<d)
                 {
                     if(a<e)
                     {
                         System.out.println("a is minimum");
                     }
                     else
                     {
                         System.out.println("e is minimum");
                     }
                 }
             }
        }
        else
        {
              if(b<c)
              {
                  if (b < d)
                  {
                      if (b < e)
                      {
                          System.out.println("b is minimum");
                      } else {
                          System.out.println("e is minimum");
                      }
                  }
              }
              else
              {
                  if (c < d)
                  {
                      if (c < e)
                      {
                          System.out.println("c is minimum");
                      } else
                      {
                          System.out.println("e is minimum");
                      }
                  }

                  else
                  {
                          if(d<e)
                          {
                              System.out.println("d is minimum");
                          }
                          else
                          {
                              System.out.println("e is minimum");
                          }
                  }
              }

        }
    }
}
