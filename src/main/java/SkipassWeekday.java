import java.util.Calendar;

class SkipassWeekday extends Skipass {
    SkipassWeekday(String name, CountStrategy newCountStrategy) {
        super(name, newCountStrategy);
    }

    @Override
    boolean ride() {
        Calendar calendar = Calendar.getInstance();
        int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
        if (weekDay == 1 || weekDay == 7 || getBanned()) {
            return false;
        }
        return countStrategy.ride();
    }
}
