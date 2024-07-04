public class SumProduct 
{
    public static void main(String[] args) 
    {
        int num = 1234;

        int sum = 0;
        int product = 1;
        
        while(num != 0)
        {
            int last = num % 10;

            sum += last;
            product *= last;

            num /= 10;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }  
}
