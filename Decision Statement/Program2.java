import java.util.Scanner;

public class Program2
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Raju's age: ");
    int age1 = sc.nextInt();

    System.out.print("Enter Ramu's age: ");
    int age2 = sc.nextInt();

    System.out.print("Enter Raghu's age: ");
    int age3 = sc.nextInt();


    if(age1 > 0 && age2 > 0 && age3 > 0)
    {
        if(age1 < age2 && age1 < age3)
      {
        System.out.println(age1);
      }
      else if(age2 < age1 && age2 < age3)
      {
        System.out.println(age2);
      }
      else
      {
        System.out.println(age3);
      }
    }
    else
    {
      System.out.println("Enter valid input!!!!!");
    }
    
  }
}