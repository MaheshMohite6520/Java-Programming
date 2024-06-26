import java.util.Scanner;

public class Factorial 
{ 
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Number: ");
    int num = sc.nextInt();

    // 1 Factorial
    int result = 1;

    for(int i = 2; i <= num; i++)
    {
      result *= i;
    }

    System.out.println("Factorial of " + num + ": " + result);
  }
}
