import java.util.Calendar;
//Java program to get the number of days of a month
public class DateTime_11_NoOfDatsInMonth {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Number of DAys In Month: "+cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
