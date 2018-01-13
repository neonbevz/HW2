import Enums.*;
import java.util.ArrayList;

class SkipassAdministration {
    private ArrayList<Skipass> skipasses;

    SkipassAdministration() {
        skipasses = new ArrayList<Skipass>();
    }

    public Skipass newWeekdaySkipass(String name, DaysDurations duration) {
        CountStrategy countStrategy = new CountStrategyDays(duration.getDays());
        Skipass sp = new SkipassWeekday(name, countStrategy);
        skipasses.add(sp);
        return sp;
    }

    public Skipass newWeekdaySkipass(String name, RidesDurations duration) {
        CountStrategy countStrategy = new CountStrategyRides(duration.getRides());
        skipasses.add(new SkipassWeekday(name, countStrategy));
        Skipass sp = new SkipassWeekday(name, countStrategy);
        skipasses.add(sp);
        return sp;
    }

    public Skipass newHolidaySkipass(String name, DaysDurations duration) {
        CountStrategy countStrategy = new CountStrategyDays(duration.getDays());
        skipasses.add(new SkipassHoliday(name, countStrategy));
        Skipass sp = new SkipassHoliday(name, countStrategy);
        skipasses.add(sp);
        return sp;
    }

    public Skipass newHolidaySkipass(String name, RidesDurations duration) {
        CountStrategy countStrategy = new CountStrategyRides(duration.getRides());
        skipasses.add(new SkipassHoliday(name, countStrategy));
        Skipass sp = new SkipassHoliday(name, countStrategy);
        skipasses.add(sp);
        return sp;
    }

    public Skipass newHolidaySkipass(String name, SeasonDurations duration) {
        CountStrategy countStrategy = new CountStrategySeason();
        skipasses.add(new SkipassHoliday(name, countStrategy));
        Skipass sp = new SkipassHoliday(name, countStrategy);
        skipasses.add(sp);
        return sp;
    }

    public boolean tryRide(Skipass skipass) {
        boolean r = skipass.ride();
        if (r) {
            System.out.println("Welcome!\n");
        } else {
            System.out.println("Entrance not allowed. Please check your pass!\n");
        }
        return r;
    }

    public void banSkipass(Skipass skipass) {
        skipass.ban();
    }

    private Skipass findById(int id) {
        for (Skipass skipass : skipasses) {
            if (skipass.getSerial() == id) {
                return skipass;
            }
        }
        return null;
    }

}
