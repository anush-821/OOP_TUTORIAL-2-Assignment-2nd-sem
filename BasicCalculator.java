import java.util.Scanner ;

public class BasicCalculator
{
    public static void main (String[] args )
    {
        Scanner sc = new Scanner (System.in );

        System.out.print ("Enter first number : " );
        double num1 = sc.nextDouble ();
        System.out.print ("Enter an operator (+, -, *, /) : " );
        char operator = sc.next ().charAt (0 );
        System.out.print ("Enter second number : " );
        double num2 = sc.nextDouble ();

        if (operator == '+' ) System.out.println ("Result = " + (num1 + num2 ) );
        if (operator == '-' ) System.out.println ("Result = " + (num1 - num2 ) );
        if (operator == '*' ) System.out.println ("Result = " + (num1 * num2 ) );
        if (operator == '/' )
        {
            if (num2 != 0 )
            {
                System.out.println ("Result = " + (num1 / num2 ) );
            }
            else
            {
                System.out.println ("Error: Division by zero." );
            }
        }
    }
}