import java.util.Calendar;

public class DateTime_2_DisplayInfo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.print("Year,Month,Day,Minute,Second : ");
        System.out.print(c.get(Calendar.YEAR) + ",");
        System.out.print(c.get(Calendar.MONTH)+1 + ",");
        System.out.print(c.get(Calendar.DATE) + ",");
        System.out.print(c.get(Calendar.MINUTE) + ",");
        System.out.println(c.get(Calendar.SECOND) + ",");
        System.out.println(c.getTime());
        System.out.println((c.getTimeInMillis()/1000/3600/24/365)-30);
    }
}
