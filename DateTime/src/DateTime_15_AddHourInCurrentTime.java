import java.time.LocalTime;

public class DateTime_15_AddHourInCurrentTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: "+time);
        LocalTime newTime = time.plusHours(4);
        System.out.println("Add 4 hours in current time:"+ newTime);
    }
}
