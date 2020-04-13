package com.udacity.mifragmentsplay.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.udacity.mifragmentsplay.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HeadFragment headFragment = new HeadFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.header_container,headFragment)
                .commit();

        BodyFragment bodyFragment = new BodyFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.body_container,bodyFragment)
                .commit();

        LegsFragment legsFragment = new LegsFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.legs_container,legsFragment)
                .commit();


    }
}
