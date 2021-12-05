import java.util.Calendar;
//Java program to get the maximum value of the year, month, week, date from the current date of a default calendar.
public class DateTime_3_MaximumOfYear {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        System.out.println("Maximum of year: "+c.getActualMaximum(Calendar.YEAR));
        System.out.println("Maximum of month: "+c.getActualMaximum(Calendar.MONTH));
    }
}
