import java.util.Scanner;

public class SunnyNo 
{
  public static void main(String[] args) 
  {
      Scanner sc = new Scanner(System.in);
      
      int num = sc.nextInt();

      int nextNum = num + 1;

      for(int i = 1; i < nextNum; i++)
      {
        if(i * i == nextNum)
        {
          System.out.println("Sunny Number.");
        }
      }
  }  
}
