import java.util.Scanner;

public class PrimeNo2 {
  
  public static void main(String[] args) 
  {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();  

    if(isPrime(num))
    {
      System.out.println("Prime Number");
    }
    else
    {
      System.out.println("Not Prime Number");
    }
  }

  public static boolean isPrime(int num)
  {
    // int count = 2;
    int count = 0;

    for(int i = 2; i <= num/2; i++)
    {
      if(num % i == 0)
      {
        count++;
      }
    }

    // return count == 2;
    return count == 0;
  }
}
