package leonardoz.github.com.countercounter;

public class CounterPresenter implements CounterContracts.Presenter {

    private Counter counter;
    private CounterContracts.View view;

    public CounterPresenter() {
        this.counter = new Counter();
    }

    @Override
    public void increaseCounter() {
        counter.increase();
        view.updateCounter(counter.getValue());
    }

    public void attach(CounterContracts.View view) {
        this.view = view;
    }

    public void detach() {
        this.view = null;
    }

}
