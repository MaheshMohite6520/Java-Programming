import java.util.Scanner;

public class FascinatingNo 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    int num = sc.nextInt();

    int num2 = num * 2;
    int num3 = num * 3;

    int ct1 = count(num2);
    int ct2 = count(num3);

    int ans1 = num * power(10, ct1) + num2;
    int ans2 = ans1 * power(10, ct2) + num3;

    if(isUnique(ans2))
    {
      System.out.println("Fascinating Number");
    }
    else
    {
      System.out.println("Not Fascinating Number");
    }
  } 
  
  public static int count(int num)
  {
    int count = 0;

    while(num != 0)
    {
        count++;

        num /= 10;
    }

    return count;
  }

  public static int power(int base, int raise)
  {
    int pow = 1;

    for(int i = raise; i > 0; i--)
    {
      pow *= base;
    }

    return pow;
  }

  public static boolean isUnique(int num)
  {
    while(num != 0)
    {
      int last = num % 10;
      num /= 10;

      int temp = num;

      while(temp != 0)
      {
        if(last == temp % 10)
        {
          return false;
        }

        temp /= 10;
      }

      num /= 10;
    }

    return true;
  }
}
