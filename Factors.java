import java.util.Scanner;

public class Factors {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a Number: ");
    int num = sc.nextInt();

    // 1 and Number itself are factors also
    int count = 2;

    System.out.print("Factors of " + num + ": ");

    System.out.print(1 + ", ");   // Common Factor is 1 for all numbers

    for(int i = 2; i <= num/2; i++)
    {
      if(num % i == 0)
      {
        System.out.print(i + ", ");
        count++;
      }
    }

    System.out.print(num);    // Number itself

    System.out.println();

    System.out.print("Count of Factors: " + count);
  }
}
