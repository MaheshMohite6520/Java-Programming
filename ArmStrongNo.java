import java.util.Scanner;

public class ArmStrongNo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int sum = 0;

        for(int i = num; i != 0; i /= 10)
        {
            int last = i % 10;

            sum += power(last);
        }

        if(sum == num)
        {
          System.out.println("ArmStrong Number");
        }
        else
        {
          System.out.println("Not ArmStrong Number");
        }
    }  

    public static int power(int num)
    {
        int pow = 1;
      
        for(int i = 0; i < 3; i++)
        {
            pow *= num;
        }

        return pow;
    }
}
