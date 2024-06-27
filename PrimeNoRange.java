import java.util.Scanner;

public class PrimeNoRange 
{
  public static void main(String[] args) 
  {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter Starting Point: ");
    int start = s.nextInt();

    System.out.print("Enter Ending Point: ");
    int end = s.nextInt();

    if(start > 2)
    {
      while(start < end)
      {
        if(isPrime(start))
        {
          System.out.print("Prime No: " + start + " ");
        }

        start++;
      }
    }
    else
    {
        System.out.println("Invalid Range");
    }
  }

  public static boolean isPrime(int num)
  {
    int count = 2;

    for(int i = 2; i <= num/2; i++)
    {
      if(num % i == 0)
      {
        count++;
      }
    }

    return count == 2;
  }
}
