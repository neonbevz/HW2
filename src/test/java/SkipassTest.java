import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SkipassTest {

    private class TestingSkipass extends Skipass {
        TestingSkipass(String name, CountStrategy countStrategy) {
            super(name, countStrategy);
        }

        @Override
        boolean ride() {
            return false;
        }
    }

    @Test
    public void ban() {
        CountStrategy cs = new CountStrategySeason();
        Skipass sp = new TestingSkipass("Philip Fry", cs);
        Assert.assertFalse(sp.getBanned());
        sp.ban();
        Assert.assertTrue(sp.getBanned());
    }

    @Test
    public void getName() {
        CountStrategy cs = new CountStrategySeason();
        Skipass sp = new TestingSkipass("Philip Fry", cs);
        Assert.assertEquals("Philip Fry", sp.getName());
    }
}