package leonardoz.github.com.countercounter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class CounterPresenterTest {

    @Mock
    private CounterContracts.View view;

    @Before
    public void setUp()  {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void should_increase_counter() {
        CounterPresenter counterPresenter = new CounterPresenter();
        counterPresenter.attach(view);
        counterPresenter.increaseCounter();
        verify(view).updateCounter(1);
    }


}