import java.util.Arrays;
import java.util.Scanner;

public class Task1 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the size of an Array: ");
    int n = sc.nextInt();

    int a [] = new int [n];

    System.out.println("Enter array elements: ");
    for(int i = 0; i < n; i++)
    {
      a [i] = sc.nextInt();
    }

    System.out.println("The array Elements are: ");
    for(int i = 0; i < n; i++)
    {
      System.out.print(a[i] + " ");
    }

    a[4] = 20;    // ArrayIndexOutOfBoundsException

    System.out.println(Arrays.toString(a));
  }  
}
