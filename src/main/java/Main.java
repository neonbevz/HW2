import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int i=calendar.get(Calendar.DAY_OF_WEEK);
        System.out.print(i);
    }
}
