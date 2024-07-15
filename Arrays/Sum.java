public class Sum 
{
    public static void main(String[] args) 
    {
        int a [] = {2, 3, 7, 5, 8, 9};

        System.out.println(isEven(a));
    }
    
    public static boolean isEven(int a [])
    {
        int sum = 0;

        for(int i = 0; i < a.length; i++)
        {
            sum += a[i];
        }

        if(sum % 2 == 0)
        {
           return true;
        }
        else
        {
            return false;
        }
    }
}
