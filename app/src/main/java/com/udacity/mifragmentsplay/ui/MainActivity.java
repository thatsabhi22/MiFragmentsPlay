package com.udacity.mifragmentsplay.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.udacity.mifragmentsplay.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BodyPartFragment headFragment = new BodyPartFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.header_container,headFragment)
                .commit();

    }
}
