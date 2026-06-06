import java.util.Scanner ;

public class PalindromeCheck
{
    public static void main (String[] args )
    {
        Scanner sc = new Scanner (System.in );
        System.out.print ("Enter an integer : " );
        int x = sc.nextInt ();

        System.out.println ("Is palindrome = " + isPalindrome (x ) );
    }

    public static boolean isPalindrome (int x )
    {
        if (x < 0 ) return false;

        int original = x;
        int reversed = 0;

        while (x != 0 )
        {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
}