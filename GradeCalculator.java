import java.util.Scanner ;

public class GradeCalculator
{
    public static void main (String[] args )
    {
        Scanner sc = new Scanner (System.in );
        System.out.print ("Enter marks obtained : " );
        double marks = sc.nextDouble ();

        String grade = (marks >= 80 ) ? "A" :
                (marks >= 75 ) ? "A-" :
                (marks >= 70 ) ? "B+" :
                (marks >= 65 ) ? "B" :
                (marks >= 60 ) ? "B-" :
                (marks >= 55 ) ? "C+" :
                (marks >= 50 ) ? "C" :
                (marks >= 47 ) ? "C-" :
                (marks >= 44 ) ? "D+" :
                (marks >= 40 ) ? "D" : "F";

        System.out.println ("Your Grade is = " + grade );
    }
}