import org.junit.Assert;
import org.junit.Test;

public class CountStrategyRidesTest {

    @Test
    public void ride() {
        CountStrategy csd = new CountStrategyRides(3);
        Assert.assertTrue(csd.ride());
        Assert.assertTrue(csd.ride());
        Assert.assertTrue(csd.ride());

        Assert.assertFalse(csd.ride());
    }
}