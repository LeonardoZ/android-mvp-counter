package leonardoz.github.com.countercounter;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void should_increase_to_100000() {
        Counter counter = new Counter();
        int i = 100_000;

        while (i > 0) {
            counter.increase();
            i--;
        }
        assertThat(counter.getValue(), is(100_000));
    }

    @Test
    public void should_getValue_by_0() {
        Counter counter = new Counter();
        assertThat(counter.getValue(), is(0));
    }


}