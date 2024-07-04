import java.util.Scanner;

public class DuckNo 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();  

    if(num > 0 && num != 0)
    {
        while(num != 0)
        {
          int last = num % 10;

          if(last == 0)
          {
            System.out.println("Duck Number");
            break;
          }

          num /= 10;
        }

        if(num == 0)
        {
          System.out.println("Not Duck Number");
        }
    }
    else
    {
      System.out.println("Not Duck Number");
    }
  }  
}
