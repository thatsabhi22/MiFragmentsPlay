package com.udacity.mifragmentsplay.ui;

import android.content.Intent;
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
        //Toast.makeText(this, "position clicked: " + position, Toast.LENGTH_SHORT).show();

        if (position > 0) {
            int bodyPartNumber = position / 12;
            int listIndex = position - 12*bodyPartNumber;

            switch(bodyPartNumber){
                case 0: headIndex = listIndex;
                    break;
                case 1: bodyIndex = listIndex;
                    break;
                case 2: legIndex = listIndex;
                    break;
                default:
                    break;
            }
        }

        Bundle b = new Bundle();
        b.putInt("headIndex",headIndex);
        b.putInt("bodyIndex",bodyIndex);
        b.putInt("legIndex",legIndex);

        final Intent intent = new Intent(this,BodyActivity.class);
        intent.putExtras(b);
        startActivity(intent);
    }
}
