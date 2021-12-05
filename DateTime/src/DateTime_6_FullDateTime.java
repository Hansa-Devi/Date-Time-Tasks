import java.util.Calendar;

public class DateTime_6_FullDateTime {
    //Java program to get current full date and time
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Current Full Date And Time: ");
        System.out.println("Date-month-year Hour:Minute:seconds: "+cal.get(Calendar.DATE)+"-"+(cal.get(Calendar.MONTH)+1) +"-"+cal.get(Calendar.YEAR)+
                " "+cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
    }
}
