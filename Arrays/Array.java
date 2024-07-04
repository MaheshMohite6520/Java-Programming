public class Array
{
  public static void main(String[] args) 
  {
    int a [] = { 10, 20, 30 };

    System.out.println("Reference: " + a);

    // System.out.println(a[0]);
    // System.out.println(a[1]);
    // System.out.println(a[2]);

    System.out.println("Array Elements: ");
    for(int i = 0; i < a.length; i++)
    {
      System.out.print(a[i] + " ");
    }
  }
}