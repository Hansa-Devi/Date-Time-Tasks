import java.util.Calendar;

public class DateTime_7_LastDayOfCurrentMonth {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Current Month: "+(cal.get(Calendar.MONTH)+1));
        System.out.println("Last day of Current Month:"+cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
