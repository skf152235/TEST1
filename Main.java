import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy'年'MM'月'dd'日'E'曜日'h'時'mm'分'");
        sdf.setTimeZone(TimeZone.getTimeZone("US/Hawaii"));
        String str = sdf.format(date);
        System.out.println("現在のハワイの時間は"+str);
    }
}
