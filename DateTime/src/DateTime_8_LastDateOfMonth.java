import java.net.Socket;
import java.util.Calendar;

public class DateTime_8_LastDateOfMonth {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Last Month: "+ (cal.get(Calendar.MONTH)+1));
        cal.set(Calendar.DAY_OF_MONTH,cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println("Date Of Last Day Of month: "+cal.getTime());
    }
}
