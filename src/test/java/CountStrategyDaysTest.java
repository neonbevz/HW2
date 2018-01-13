import org.junit.Assert;

public class CountStrategyDaysTest {

    @org.junit.Test
    public void ride() {
        CountStrategyDays csd = new CountStrategyDays(5);
        Assert.assertTrue(csd.ride());
        csd = new CountStrategyDays(0);
        Assert.assertFalse(csd.ride());
    }
}