public class SecSmallest 
{
    public static void main(String[] args) 
    {
        int a [] = {23, -45, 7, 5, 3, 90, -45, -77};

        secondSmallest(a);
    }
    
    public static void secondSmallest(int a [])
    {
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] < min)
            {
                secMin = min;
                min = a[i];
            }
            else if(min != a[i] && a[i] < secMin)
            {
                secMin = a[i];
            }
        }

        System.out.println(secMin);
    }
}
