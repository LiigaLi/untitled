package lekcijaPieci.staticPiemers;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utilities {
    public static int name;
    public static void printDate(){
        System.out.println(name);
        System.out.println("++++++++++++++++++++++++++++\n");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        System.out.println("++++++++++++++++++++++++++++\n");
    }

}
