import java.util.Scanner;

public class Zigzag 
{
  public static void main(String[] args) 
  {
      Scanner sc = new Scanner(System.in);
      
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();

      if(length(n1) == length(n2))
      {
          int rev_of_num1 = reverse(n1);

          int zigzag = 0;

          while(rev_of_num1 != 0)
          {
              int d = rev_of_num1 % 10;

              zigzag = zigzag * 10 + d;
          }
      }
      else
      {
        System.out.println("Invalid");
      }


  }  

  public static int length(int num)
  {
    int count = 0;

    while(num != 0)
    {
      count++;

      num /= 10;
    }

    return count;
  }

  public static int reverse(int num)
  {
    int rev = 0;

    while(num != 0)
    {
      int last = num % 10;

      rev = rev * 10 + last;
    }
  }
}
