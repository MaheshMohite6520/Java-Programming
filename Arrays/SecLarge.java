public class SecLarge 
{
    public static void main(String[] args) 
    {
        int a [] = {1, 2, 3, 4, 5, 6};
        
        findSecLargest(a);
    }  

    public static void findSecLargest(int a [])
    {
      int max = Integer.MIN_VALUE;
      int secMax = Integer.MIN_VALUE;

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > max)
            {
                secMax = max;
                max = a[i];
            }
            else if(a[i] != max && a[i] > secMax)
            {
                secMax = a[i];
            }
        }

        System.out.println(secMax);
    }
}
