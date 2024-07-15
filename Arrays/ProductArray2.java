import java.util.Arrays;

public class ProductArray2 
{
  public static void main(String[] args) 
  {
    int a [] = {0, 2, 4, 6};
    
    int b [] = new int[a.length];

    boolean flag = false;

    int product = 1;

    for(int i = 0; i < a.length; i++)
    {
      if(a[i] != 0)
      {
        product *= a[i];
      }
      else
      {
        flag = true;
      }
    }

    System.out.println(product);

    if(flag == false)
    {
      for(int i = 0; i < a.length; i++)
      {
        b[i] = product / a[i];
      }
    }
    else
    {
      for(int i = 0; i < a.length; i++)
      {
        if(a[i] == 0)
        {
          b[i] = product;
        }
      }
    }

    System.out.println(Arrays.toString(b));
  }  
}
