package leonardoz.github.com.countercounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CounterContracts.View {

    private TextView counterLabel = null;
    private CounterContracts.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterLabel = (TextView) findViewById(R.id.main_activity_label_inc);
        presenter = Injector.counterPresenter();
        presenter.attach(this);
    }

    @Override
    protected void onDestroy() {
        presenter.detach();
        super.onDestroy();
    }

    public void increase(View view) {
        presenter.increaseCounter();
    }

    @Override
    public void updateCounter(int newValue) {
        counterLabel.setText(Integer.toString(newValue));
    }
}
