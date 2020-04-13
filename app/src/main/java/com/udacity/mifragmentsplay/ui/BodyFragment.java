package com.udacity.mifragmentsplay.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.udacity.mifragmentsplay.R;
import com.udacity.mifragmentsplay.data.AndroidImageAssets;

import java.util.List;

public class BodyFragment extends Fragment {

    private static final String TAG = "BodyFragment";
    private List<Integer> mImageIds;
    private int mListIndex;

    public BodyFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);
        final ImageView imageView = rootView.findViewById(R.id.body_part_image_view);

        imageView.setImageResource(mImageIds.get(mListIndex));
        if(mImageIds!=null) {
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(mListIndex<mImageIds.size()-1){
                        mListIndex++;
                    }
                    else{
                        mListIndex=0;
                    }
                    imageView.setImageResource(mImageIds.get(mListIndex));
                }
            });
        }
        else{
            Log.d(TAG, "The fragment has null list of imageIds.");
        }
        return rootView;
    }

    public void setmImageIds(List<Integer> mImageIds) {
        this.mImageIds = mImageIds;
    }

    public void setmListIndex(int mListIndex) {
        this.mListIndex = mListIndex;
    }
}
