import org.junit.Assert;
import org.junit.Test;

public class DateTest {

    @Test
    public void before() {
        Date d1 = new Date();
        Date d2 = new Date(1);
        Assert.assertTrue(d1.before(d2));
        Assert.assertFalse(d2.before(d1));
    }

    @Test
    public void getValue() {
        Date d1 = new Date();
        Date d2 = new Date(1);
        Assert.assertTrue(d1.getValue() < d2.getValue());
    }
}