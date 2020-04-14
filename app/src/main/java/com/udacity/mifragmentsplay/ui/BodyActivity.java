package com.udacity.mifragmentsplay.ui;

import android.content.Intent;
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

            Intent intent = getIntent();
            int headIndex = 0,bodyIndex = 0,legIndex = 0;
            Bundle b = intent.getExtras();
            if(b!=null) {
                headIndex = b.getInt("headIndex", 0);
                bodyIndex = b.getInt("bodyIndex", 0);
                legIndex = b.getInt("legIndex", 0);
            }

            BodyFragment headFragment = new BodyFragment();
            headFragment.setmImageIds(AndroidImageAssets.getHeads());
            headFragment.setmListIndex(headIndex);
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.header_container, headFragment)
                    .commit();

            BodyFragment bodyFragment = new BodyFragment();
            bodyFragment.setmImageIds(AndroidImageAssets.getBodies());
            bodyFragment.setmListIndex(bodyIndex);
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.body_container, bodyFragment)
                    .commit();

            BodyFragment legsFragment = new BodyFragment();
            legsFragment.setmImageIds(AndroidImageAssets.getLegs());
            legsFragment.setmListIndex(legIndex);
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.legs_container, legsFragment)
                    .commit();
        }
    }
}
