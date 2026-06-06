import java.util.Scanner ;

public class AgePredictor
{
    public static void main (String[] args )
    {
        Scanner sc = new Scanner (System.in );

        System.out.print ("Enter your current age : " );
        int currentAge = sc.nextInt ();

        System.out.println ("Age after 10 years : " + (currentAge + 10 ) );
        System.out.println ("Age after 25 years : " + (currentAge + 25 ) );
        System.out.println ("Age after 50 years : " + (currentAge + 50 ) );

        int yearsTo100 = 100 - currentAge ;
        int targetYear = 2026 + yearsTo100 ;

        System.out.println ("Year turning 100 = " + targetYear );
    }
}