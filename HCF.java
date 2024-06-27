import java.util.Scanner;

public class HCF 
{
  public static void main(String[] args) 
  {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter First Number: ");
    int a = s.nextInt();

    System.out.print("Enter Second Number: ");
    int b = s.nextInt();

    int hcf = 1;

    int max = a > b ? a : b;

    for(int i = max/2; i > 0; i--)
    {
      if(a%i == 0 && b%i == 0)
      {
        hcf = i;
        break;
      }
    }

    System.out.println("HCF: " +hcf);
  }
}
