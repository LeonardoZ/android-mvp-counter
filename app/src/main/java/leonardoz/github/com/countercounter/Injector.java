package leonardoz.github.com.countercounter;


public class Injector {

    public static CounterContracts.Presenter counterPresenter() {
        return new CounterPresenter();
    }



}
