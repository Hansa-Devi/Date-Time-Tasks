import java.util.Calendar;

public class DateTIme_1_DAtaObjectCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.getFirstDayOfWeek());
        System.out.println(c.getCalendarType());

    }
}

