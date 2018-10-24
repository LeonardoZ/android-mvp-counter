package leonardoz.github.com.countercounter;

public class CounterContracts {

    interface View {
        void updateCounter(int newValue);
    }

    interface Presenter {
        void increaseCounter();
        void attach(View view);
        void detach();
    }



}
