package com.udacity.mifragmentsplay.ui;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.udacity.mifragmentsplay.R;

import java.util.Collections;
import java.util.List;

public class AllBodyPartsAdapter
        extends RecyclerView.Adapter<AllBodyPartsAdapter.AllBodyPartsViewHolder>  {

    private final LayoutInflater inflater;
    private final Context mContext;
    private List<Integer> parts = Collections.emptyList();

    public AllBodyPartsAdapter(Context mContext, List<Integer> parts) {
        inflater = LayoutInflater.from(mContext);
        this.mContext = mContext;
        this.parts = parts;
    }

    @NonNull
    @Override
    public AllBodyPartsAdapter.AllBodyPartsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = (View) inflater.inflate(R.layout.all_body_parts_single_item, parent, false);
        return new AllBodyPartsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllBodyPartsAdapter.AllBodyPartsViewHolder holder, int position) {
        final Integer current = parts.get(position);
        holder.singleBodyPartIV.setImageResource(current);

        holder.itemView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(mContext, BodyActivity.class);
                        mContext.startActivity(intent);
                    }
                });
    }

    @Override
    public int getItemCount() {
        return parts == null ? 0 : parts.size();
    }

    public class AllBodyPartsViewHolder extends RecyclerView.ViewHolder {
        ImageView singleBodyPartIV;
        public AllBodyPartsViewHolder(@NonNull View itemView) {
            super(itemView);
            singleBodyPartIV = itemView.findViewById(R.id.body_part_image_view);
        }
    }
}
