import java.util.Scanner;

public class UniqueNo 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    while(num != 0)
    {
      int last = num % 10;

      num /= 10;
      
      int temp = num;

      while(temp != 0)
      {
        if(last == temp % 10)
        {
          break;
        }

        temp /= 10;
      }

      num /= 10;

      if (temp == 0)
			{
				System.out.println("It is Unique Number.");
        break;
			}
			else
			{
				System.out.println("It is not Unique Number.");
        break;
			}
    }

    
  }  
}
