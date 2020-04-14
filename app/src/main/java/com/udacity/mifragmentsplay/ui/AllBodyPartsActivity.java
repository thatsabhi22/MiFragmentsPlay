package com.udacity.mifragmentsplay.ui;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.udacity.mifragmentsplay.R;

public class AllBodyPartsActivity
        extends AppCompatActivity implements Communicator {

    private int headIndex;
    private int bodyIndex;
    private int legIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_body_parts);
    }

    @Override
    public void passData(int position) {
        Toast.makeText(this,"position clicked: " + position,Toast.LENGTH_SHORT).show();
    }
}
