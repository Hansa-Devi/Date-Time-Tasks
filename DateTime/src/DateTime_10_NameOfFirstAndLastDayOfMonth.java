import java.time.YearMonth;
import java.util.Calendar;

public class DateTime_10_NameOfFirstAndLastDayOfMonth {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2021,12);
        String firstDay = yearMonth.atDay(1).getDayOfWeek().name();
        String lastDay = yearMonth.atEndOfMonth().getDayOfWeek().name();
        System.out.println("First Day Of Month: "+firstDay+"\nLast Day Of Month: "+lastDay);

    }
}
