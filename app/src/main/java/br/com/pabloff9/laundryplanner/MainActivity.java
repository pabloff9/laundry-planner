package br.com.pabloff9.laundryplanner;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MainActivityContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton addNewLaundry = (FloatingActionButton) findViewById(R.id.add_laundry);
        addNewLaundry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.addLaundryClicked();
            }
        });

    }
}
