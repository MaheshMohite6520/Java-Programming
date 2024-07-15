public class MissingElement 
{
  public static void main(String[] args) 
  {
    int arr [] = {1, 2, 4, 6, 3, 7, 8};  

    int n = 8;

    for(int i = 1; i <= n; i++)
    {
      int j;
      for(j = 0; j < n - 1; j++)
      {
        if(arr[j] == i)
        {
          break;
        }
      }

      if(j == n - 1)
      {
        System.out.println(i);
        break;
      }
    }
  }  
}
