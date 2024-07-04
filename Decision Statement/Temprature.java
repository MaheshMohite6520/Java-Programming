import java.util.Scanner;

public class Temprature {
  
  public static void main(String[] args) 
  {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter temprature(in celcius): ");
      double celcius = sc.nextDouble();

      double fahrenheit = celcius * (9 / 5) + 32;
      System.out.println("Temprature in Fahrenheit: " + fahrenheit);

      double lowerBound = 70;
      double upperBound = 80;

      if (fahrenheit >= lowerBound && fahrenheit <= upperBound) 
      {
          System.out.println("Within the Range");
      }
      else
      {
          System.out.println("Not in Range");
      }
  }
}
