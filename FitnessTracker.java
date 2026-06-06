import java.util.Scanner ;

public class FitnessTracker
{
    public static void main (String[] args )
    {
        Scanner sc = new Scanner (System.in );
        int[] steps = new int[7];
        int total = 0;

        for (int i = 0; i < 7; i++)
        {
            System.out.print ("Enter steps for day " + (i + 1) + " : " );
            steps[i] = sc.nextInt ();
            total = total + steps[i];
        }

        double avg = (double ) total / 7;
        int max = steps[0];

        for (int i = 1; i < 7; i++)
        {
            if (steps[i] > max )
            {
                max = steps[i];
            }
        }

        System.out.println ("Total steps = " + total );
        System.out.println ("Average steps = " + avg );
        System.out.println ("Highest steps = " + max );
    }
}