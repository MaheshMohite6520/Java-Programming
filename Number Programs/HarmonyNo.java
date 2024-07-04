import java.util.Scanner;

public class HarmonyNo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        
        int sum1 = 0;
        int sum2 = 0;

        while(num != 0)
        {
          int last = num % 10;

          sum1 += last;

          num /= 10;

          while(num > 9)
          {
            int rem = num % 10;

            sum2 += rem;

            num /= 10;
          }
        }

        if(sum1 == sum2)
        {
          System.out.println("Harmony Number");
        }
        else
        {
          System.out.println("Not Harmony Number");
        }
    }  
}
