import java.util.Scanner;

public class Factors {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a Number: ");
    int num = sc.nextInt();

    System.out.print("Factors of " + num + ": ");

    System.out.print(1 + ", ");

    for(int i = 2; i <= num/2; i++)
    {
      if(num % i == 0)
      {
        System.out.print(i + ", ");
      }
    }
  }
}
