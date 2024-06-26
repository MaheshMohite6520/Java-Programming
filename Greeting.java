import java.util.Scanner;

public class Greeting {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter current hour: ");
    int greet = sc.nextInt();

    if(greet >= 0 && greet < 24)
    {
        if (greet >= 5 && greet <= 11)
        {
            System.out.println("Good Morning!!!!!!!");  
        }
        else if(greet >= 12 && greet <= 16)
        {
          System.out.println("Good Afternoon!!!!!!!");
        }
        else if(greet >= 17 && greet <= 20)
        {
          System.out.println("Good Evening!!!!!");
        }
        else if( greet >= 21 && greet < 24 || greet >= 0 && greet <= 4)
        {
          System.out.println("Good Night!!!!!!!!");
        }
    }
    else
    {
        System.out.println("Enter valid hour");
    }
    
  }
}
