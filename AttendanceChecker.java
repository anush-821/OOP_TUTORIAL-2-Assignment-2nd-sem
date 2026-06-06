import java.util.Scanner ;

public class AttendanceChecker
{
    public static void main (String[] args )
    {
        Scanner sc = new Scanner (System.in );

        System.out.print ("Enter total classes conducted : " );
        int total = sc.nextInt ();

        System.out.print ("Enter classes attended : " );
        int attended = sc.nextInt ();

        double pct = ((double ) attended / total ) * 100 ;
        System.out.println ("Attendance = " + pct );

        if (pct >= 75 )
        {
            System.out.println ("Eligible for Exam" );
        }
        else
        {
            System.out.println ("Not Eligible" );
        }
    }
}