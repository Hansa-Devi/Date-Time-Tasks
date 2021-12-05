import java.time.YearMonth;
import java.util.Calendar;

public class DateTIme_13_DAyOfWeekOfpecDAte {
    //Java program to get a day of the week of a specific date.
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Day of Week of date 10");

        YearMonth yearMonth = YearMonth.of(2021,12);
        String tenthDAy = yearMonth.atDay(10).getDayOfWeek().name();
        System.out.println(tenthDAy);

    }
}
