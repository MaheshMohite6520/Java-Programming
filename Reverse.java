import java.util.Scanner;

public class Reverse 
{
  public static void main(String[] args) 
  {
      Scanner sc = new Scanner(System.in);  

      System.out.print("Enter a Number: ");
      int num = sc.nextInt();

      int reverse = 0;

      for(int i = num; i != 0; i /= 10)
      {
        int last = i % 10;

        reverse = reverse * 10 + last;
      }

      System.out.println("Reversed No: " + reverse);
  }  
}
