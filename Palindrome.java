import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number: ");
        int n1 = sc.nextInt();

        System.out.println(isPalindrome(n1));
    }  

    public static boolean isPalindrome(int n1)
    {
        int reverse = 0;

        for(int i = n1; i != 0; i /= 10)
        {
          int last = i % 10;

          reverse = reverse * 10 + last;
        }

        return n1 == reverse;
    }
}
