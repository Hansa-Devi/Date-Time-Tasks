import java.util.Calendar;
//Java program to get the minimum value of the year, month, week, date from the current date of a default calendar.
public class DateTime_4_MinimumOfTime {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Minimum of Year:"+cal.getMinimum(Calendar.YEAR));
        System.out.println("Minimum of Month: "+cal.getMinimum(Calendar.MONTH));
        System.out.println("Minimum Of Week of year: "+cal.getMinimum(Calendar.WEEK_OF_YEAR));
        System.out.println("Minimum Of Week of month: "+cal.getMinimum(Calendar.WEEK_OF_MONTH));
        System.out.println("Minimum of Date: "+cal.getMinimum(Calendar.DATE));
    }
}
