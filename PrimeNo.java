import java.util.Scanner;

public class PrimeNo {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    int count = 2;    // 1 and num itself is a factor
    // int count = 0;    

    for(int i = 2; i <= num/2; i++)
    {
      if(num % 2 == 0)
      {
        count++;
      }
    }

    if(count == 2)
    {
        System.out.println("Prime Number");
    }
    else
    {
      System.out.println("Not Prime Number");
    }

    // if(count == 0)
    // {
    //     System.out.println("Prime Number");
    // }
    // else
    // {
    //   System.out.println("Not Prime Number");
    // }
  }
}
