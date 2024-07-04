import java.util.Scanner;

public class SymmetricPowerNo 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    int n1 = sc.nextInt();

    if(n1 > 0)
    {
      if(length(n1) % 2 == 0)
      {
        int temp = n1;

        int rem = temp % 100;

        temp /= 100;

        int last = temp;

        int sum = rem + last;

        int square = sum * sum;

        if (square == n1) 
        {
            System.out.println("Power Symmetric Number");  
        }
        else
        {
          System.out.println("Not Power Symmetric Number");
        }
      }
    
      else
      {
          System.out.println("Enter Even digit Number.");
      }
    }
    else
    {
        System.out.println("Enter Positive Integer.");
    }
  }  

  public static int length(int num)
  {
    int count = 0;

    while(num != 0)
    {
      int last = num % 10;
      count++;
      num /= 10;
    }

    return count;
  }
}
