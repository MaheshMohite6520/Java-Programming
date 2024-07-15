public class CountPositiveNegative 
{
    public static void main(String[] args) 
    {
        int a [] = {12, -34, 45, 67, -68, -45, 56};

        countPositiveNegative(a);
    }  

    public static void countPositiveNegative(int a [])
    {
        int countPositive = 0;
        int countNegative = 0;

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > 0)
            {
              countPositive++;
            }
            else
            {
                countNegative++;
            }
        }

        System.out.println(countPositive);
        System.out.println(countNegative);
    }
}
