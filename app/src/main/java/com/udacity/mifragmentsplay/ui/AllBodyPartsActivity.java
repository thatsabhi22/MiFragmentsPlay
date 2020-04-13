package com.udacity.mifragmentsplay.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.udacity.mifragmentsplay.R;
import com.udacity.mifragmentsplay.data.AndroidImageAssets;

import java.util.List;

public class AllBodyPartsActivity extends AppCompatActivity {

    RecyclerView allBodyPartsRV;
    AllBodyPartsAdapter allBodyPartsAdapter;
    List<Integer> partsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_body_parts);

        allBodyPartsRV = findViewById(R.id.all_body_parts_recycler_view);
        partsList = AndroidImageAssets.getAll();

        allBodyPartsAdapter = new AllBodyPartsAdapter(this, partsList);
        allBodyPartsRV.setAdapter(allBodyPartsAdapter);
        RecyclerView.LayoutManager mLayoutManager
                = new GridLayoutManager(this, 2);
        allBodyPartsRV.setLayoutManager(mLayoutManager);
    }
}
