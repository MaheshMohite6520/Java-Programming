public class EvenOdd 
{
    public static void main(String[] args) 
    {
        int a [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        countEvenOdd(a);
    }
    
    public static void countEvenOdd(int a [])
    {
        int countEven = 0;
        int countOdd = 0;

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 == 0)
            {
                countEven++;
            }
            else
            {
                countOdd++;
            }
        }

        System.out.println("Even Count: " + countEven);
        System.out.println("Odd Count: " + countOdd);
    }
}
