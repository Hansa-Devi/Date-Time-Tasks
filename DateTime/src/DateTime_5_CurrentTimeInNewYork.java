import java.util.Calendar;
import java.util.TimeZone;

public class DateTime_5_CurrentTimeInNewYork {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println("Time in New York: "+cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
    }

}
