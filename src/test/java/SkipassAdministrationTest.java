import Enums.DaysDurations;
import Enums.RidesDurations;
import Enums.SeasonDurations;
import org.junit.Assert;
import org.junit.Test;

public class SkipassAdministrationTest {

    @Test
    public void newWeekdaySkipass() {
        SkipassAdministration sa = new SkipassAdministration();
        Skipass sp = sa.newWeekdaySkipass("Philip Fry", DaysDurations.ONE);
        Assert.assertTrue(sp.ride());
    }

    @Test
    public void newWeekdaySkipass1() {
        SkipassAdministration sa = new SkipassAdministration();
        Skipass sp = sa.newWeekdaySkipass("Philip Fry", RidesDurations.TEN);
        for (int i=0; i<10; i++) {
            Assert.assertTrue(sp.ride());
        }
        Assert.assertFalse(sp.ride());
    }

    @Test
    public void newHolidaySkipass() {
        SkipassAdministration sa = new SkipassAdministration();
        Skipass sp = sa.newHolidaySkipass("Philip Fry", DaysDurations.ONE);
        Assert.assertTrue(sp.ride());
    }

    @Test
    public void newHolidaySkipass1() {
        SkipassAdministration sa = new SkipassAdministration();
        Skipass sp = sa.newHolidaySkipass("Philip Fry", RidesDurations.TEN);
        for (int i=0; i<10; i++) {
            Assert.assertTrue(sp.ride());
        }
        Assert.assertFalse(sp.ride());
    }

    @Test
    public void newHolidaySkipass2() {
        SkipassAdministration sa = new SkipassAdministration();
        Skipass sp = sa.newHolidaySkipass("Philip Fry", SeasonDurations.SEASON);
        Assert.assertTrue(sp.ride());
    }

    @Test
    public void tryRide() {
        SkipassAdministration sa = new SkipassAdministration();
        Skipass sp = sa.newHolidaySkipass("Philip Fry", RidesDurations.TEN);
        Skipass sp2 = sa.newWeekdaySkipass("Philip Fry", RidesDurations.TEN);
        for (int i=0; i<10; i++) {
            Assert.assertTrue(sa.tryRide(sp) || sa.tryRide(sp2));
        }
        Assert.assertFalse(sa.tryRide(sp) || sa.tryRide(sp2));
    }

    @Test
    public void banSkipass() {
        SkipassAdministration sa = new SkipassAdministration();
        Skipass sp = sa.newHolidaySkipass("Philip Fry", RidesDurations.TEN);
        Skipass sp2 = sa.newWeekdaySkipass("Philip Fry", RidesDurations.TEN);
        Assert.assertTrue(sa.tryRide(sp) || sa.tryRide(sp2));
        sa.banSkipass(sp);
        sa.banSkipass(sp2);
        Assert.assertFalse(sa.tryRide(sp) || sa.tryRide(sp2));
    }
}