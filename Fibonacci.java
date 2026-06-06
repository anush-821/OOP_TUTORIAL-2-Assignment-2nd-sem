import java.util.Scanner ;

public class Fibonacci
{
    public static void main (String[] args )
    {
        Scanner sc = new Scanner (System.in );
        System.out.print ("Enter the number of terms (n) : " );
        int n = sc.nextInt ();

        int a = 0;
        int b = 1;
        System.out.print ("Fibonacci Series : " );

        for (int i = 1; i <= n; i++)
        {
            System.out.print (a + " " );
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println ();
    }
}