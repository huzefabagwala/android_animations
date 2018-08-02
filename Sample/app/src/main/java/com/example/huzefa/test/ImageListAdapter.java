package com.example.huzefa.test;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class ImageListAdapter extends RecyclerView.Adapter<ImageListAdapter.ImageListViewHolder> {

    private List<Integer> drawableResources = new ArrayList<>();

    ImageListAdapter() {

    }

    public void updateList(List<Integer> drawableResources) {
        this.drawableResources.clear();
        this.drawableResources.addAll(drawableResources);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ImageListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image_list, parent, false);
        return new ImageListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageListViewHolder holder, int position) {
        ImageView itemImageView = holder.itemView.findViewById(R.id.image_view);
        Drawable d = ContextCompat.getDrawable(holder.itemView.getContext(), drawableResources.get(position));
        itemImageView.setImageDrawable(d);
//        if (d instanceof AnimatedVectorDrawable) {
//            AnimatedVectorDrawable avd = (AnimatedVectorDrawable) d;
//            avd.start();
//        } else if (d instanceof AnimatedVectorDrawableCompat) {
//            AnimatedVectorDrawableCompat avd = (AnimatedVectorDrawableCompat) d;
//            avd.start();
//        }
    }



    @Override
    public int getItemCount() {
        return drawableResources.size();
    }

    class ImageListViewHolder extends RecyclerView.ViewHolder {
        public ImageListViewHolder(View itemView) {
            super(itemView);
        }

        public View getItemView() {
            return itemView;
        }
    }
}
