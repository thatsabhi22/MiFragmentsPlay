package com.udacity.mifragmentsplay.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.udacity.mifragmentsplay.R;
import com.udacity.mifragmentsplay.data.AndroidImageAssets;

public class BodyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            BodyFragment headFragment = new BodyFragment();
            headFragment.setmImageIds(AndroidImageAssets.getHeads());
            headFragment.setmListIndex(0);
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.header_container, headFragment)
                    .commit();

            BodyFragment bodyFragment = new BodyFragment();
            bodyFragment.setmImageIds(AndroidImageAssets.getBodies());
            bodyFragment.setmListIndex(0);
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.body_container, bodyFragment)
                    .commit();

            BodyFragment legsFragment = new BodyFragment();
            legsFragment.setmImageIds(AndroidImageAssets.getLegs());
            legsFragment.setmListIndex(0);
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.legs_container, legsFragment)
                    .commit();
        }
    }
}
