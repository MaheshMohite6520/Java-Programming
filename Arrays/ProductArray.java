import java.util.Arrays;

public class ProductArray 
{
  public static void main(String[] args) 
  {
    int a [] = {1, 2, 3, 4, 5};
    
    int b [] = new int [a.length];

   prodArr(a, b);
  } 

  public static void prodArr(int a [], int b [])
  {
    int product = 1;

    for(int i = 0; i < a.length; i++)
    {
      product *= a[i];
    }

    for(int i = 0; i < a.length; i++)
    {
      b [i] = product / a[i];
    }

    System.out.println(Arrays.toString(b));
  }
}
