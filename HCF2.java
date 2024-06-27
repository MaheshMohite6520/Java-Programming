import java.util.Scanner;

public class HCF2 
{
  public static void main(String[] args) 
  {
    Scanner s = new Scanner(System.in);
    
    int n1 = s.nextInt();
    int n2 = s.nextInt();

    int min = n1 < n2 ? n1 : n2;

    // while(true)
    // {
    //   if(n1 % min == 0 && n2 % min == 0)
    //   {
    //     System.out.println("HCF: " + min);
    //     break;
    //   }

    //   min--;
    // }

    for(int i = min; i > 0; i--)
    {
      if(n1 % i == 0 && n2 % i == 0)
      {
        System.out.println("HCF: " + i);
        break;
      }
    }
  }  
}
