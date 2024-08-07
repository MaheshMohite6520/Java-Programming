public class MinElement 
{
  public static void main(String[] args) 
  {
    int a [] = {1, 423, 6, 46, 23, 13, 53, 4};
    
    minMax(a);
  }  

  public static void minMax(int a [])
  {
    int min = Integer.MAX_VALUE;

    int max = Integer.MIN_VALUE;

    for(int i = 0; i < a.length; i++)
    {
      if(a[i] < min)
      {
        min = a[i];
      }
      else if(a[i] > max)
      {
        max = a[i];
      }
    }

    System.out.print(min + " ");
    System.out.print(max);
  } 
}
