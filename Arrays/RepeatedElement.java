public class RepeatedElement 
{
    public static void main(String[] args) 
    {
        // int arr [] = {10, 5, 3, 4, 3, 5, 6};
        int arr [] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        
        findRepeated(arr);
    }  

    public static void findRepeated(int arr [])
    {
      for(int i = 0; i < arr.length - 1; i++)
      {
          for(int j = i + 1; j < arr.length; j++)
          {
            if(arr[i] == arr[j])
            {
              System.out.println(arr[i]);
              return;
            }
          }
      }
    }
}
