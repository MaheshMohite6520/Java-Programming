import java.util.Arrays;

public class ReverseArr 
{
  public static void main(String[] args) 
  {
    int a [] = {1, 2, 3, 4, 5};
    
    int ans [] = new int [a.length];

    reverseArr(a, ans);
  } 
  
  public static void reverseArr(int a [], int ans [])
  {
    for(int i = a.length-1, j = 0; i >= 0; i--, j++)
    {
      ans[j] = a[i];
    }

    System.out.println(Arrays.toString(ans));
  }
}
