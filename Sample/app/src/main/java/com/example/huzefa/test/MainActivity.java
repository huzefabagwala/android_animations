package com.example.huzefa.test;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageListAdapter imageListAdapter = new ImageListAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void animate(View view) {
        ImageView v = (ImageView) view;
        Drawable d = v.getDrawable();
        if (d instanceof AnimatedVectorDrawable) {
            AnimatedVectorDrawable avd = (AnimatedVectorDrawable) d;
            avd.start();
        } else if (d instanceof AnimatedVectorDrawableCompat) {
            AnimatedVectorDrawableCompat avd = (AnimatedVectorDrawableCompat) d;
            avd.start();
        }
    }

    boolean temp1 = true;

    public void animate_play_to_pause(View view) {
        ImageView v = (ImageView) view;
        AnimatedVectorDrawableCompat animDrawable = AnimatedVectorDrawableCompat.create(this, temp1 ? R.drawable.play_to_pause : R.drawable.pause_to_play);
        ImageView imageView = findViewById(R.id.image_view_play_to_pause);
        imageView.setImageDrawable(animDrawable);
        animDrawable.start();
        temp1 = !temp1;
    }

    boolean temp2 = true;

    public void animate_edit_to_done(View view) {
        ImageView v = (ImageView) view;
        AnimatedVectorDrawableCompat animDrawable = AnimatedVectorDrawableCompat.create(this, temp2 ? R.drawable.edit_to_done : R.drawable.done_to_edit);
        ImageView imageView = findViewById(R.id.image_view_edit_to_done);
        imageView.setImageDrawable(animDrawable);
        animDrawable.start();
        temp2 = !temp2;
    }

    boolean temp3 = true;

    public void animate_list_to_grid(View view) {
        ImageView v = (ImageView) view;
        AnimatedVectorDrawableCompat animDrawable = AnimatedVectorDrawableCompat.create(this, temp3 ? R.drawable.list_to_grid : R.drawable.grid_to_list);
        ImageView imageView = findViewById(R.id.image_view_list_to_grid);
        imageView.setImageDrawable(animDrawable);
        animDrawable.start();
        temp3 = !temp3;
    }

    boolean temp4 = true;

    public void animate_mute(View view) {
        ImageView v = (ImageView) view;
        AnimatedVectorDrawableCompat animDrawable = AnimatedVectorDrawableCompat.create(this, temp4 ? R.drawable.mute : R.drawable.unmute);
        ImageView imageView = findViewById(R.id.image_view_mute);
        imageView.setImageDrawable(animDrawable);
        animDrawable.start();
        temp4 = !temp4;
    }

    boolean temp5 = true;

    public void animate_show_to_hide(View view) {
        ImageView v = (ImageView) view;
        AnimatedVectorDrawableCompat animDrawable = AnimatedVectorDrawableCompat.create(this, temp5 ? R.drawable.show_to_hide : R.drawable.hide_to_show);
        ImageView imageView = findViewById(R.id.image_view_show_to_hide);
        imageView.setImageDrawable(animDrawable);
        animDrawable.start();
        temp5 = !temp5;
    }

    boolean temp6 = true;

    public void animate_repeat(View view) {
        ImageView v = (ImageView) view;
        AnimatedVectorDrawableCompat animDrawable = AnimatedVectorDrawableCompat.create(this, temp6 ? R.drawable.repeat_on : R.drawable.repeat_one);
        ImageView imageView = findViewById(R.id.image_view_repeat);
        imageView.setImageDrawable(animDrawable);
        animDrawable.start();
        temp6 = !temp6;
    }

    boolean temp7 = true;

    public void animate_repeat_one(View view) {
        ImageView v = (ImageView) view;
        AnimatedVectorDrawableCompat animDrawable = AnimatedVectorDrawableCompat.create(this, temp7 ? R.drawable.repeat_one : R.drawable.repeat_off);
        ImageView imageView = findViewById(R.id.image_view_repeat_one);
        imageView.setImageDrawable(animDrawable);
        animDrawable.start();
        temp7 = !temp7;
    }

    boolean temp8 = true;

    public void animate_shuffle(View view) {
        ImageView v = (ImageView) view;
        AnimatedVectorDrawableCompat animDrawable = AnimatedVectorDrawableCompat.create(this, temp8 ? R.drawable.shuffle : R.drawable.shuffle_off);
        ImageView imageView = findViewById(R.id.image_view_shuffle);
        imageView.setImageDrawable(animDrawable);
        animDrawable.start();
        temp8 = !temp8;
    }

    boolean temp9 = true;

    public void animate_accordian(View view) {
        ImageView v = (ImageView) view;
        AnimatedVectorDrawableCompat animDrawable = AnimatedVectorDrawableCompat.create(this, temp9 ? R.drawable.expand : R.drawable.collapse);
        ImageView imageView = findViewById(R.id.image_view_accordian);
        imageView.setImageDrawable(animDrawable);
        animDrawable.start();
        temp9 = !temp9;
    }

    boolean temp10 = true;

    public void animate_search_to_back(View view) {
        ImageView v = (ImageView) view;
        AnimatedVectorDrawableCompat animDrawable = AnimatedVectorDrawableCompat.create(this, temp10 ? R.drawable.search_to_back : R.drawable.back_to_search);
        ImageView imageView = findViewById(R.id.image_view_search_to_back);
        imageView.setImageDrawable(animDrawable);
        animDrawable.start();
        temp10 = !temp10;
    }

    boolean temp11 = true;

    public void animate_check(View view) {
        ImageView v = (ImageView) view;
        AnimatedVectorDrawableCompat animDrawable = AnimatedVectorDrawableCompat.create(this, temp11 ? R.drawable.check : R.drawable.uncheck);
        ImageView imageView = findViewById(R.id.image_view_check);
        imageView.setImageDrawable(animDrawable);
        animDrawable.start();
        temp11 = !temp11;
    }

    boolean temp12 = true;

    public void animate_radio(View view) {
        ImageView v = (ImageView) view;
        AnimatedVectorDrawableCompat animDrawable = AnimatedVectorDrawableCompat.create(this, temp12 ? R.drawable.radio_on : R.drawable.radio_off);
        ImageView imageView = findViewById(R.id.image_view_radio);
        imageView.setImageDrawable(animDrawable);
        animDrawable.start();
        temp12 = !temp12;
    }

    boolean temp13 = true;

    public void animate_hamburger(View view) {
        ImageView v = (ImageView) view;
        AnimatedVectorDrawableCompat animDrawable = AnimatedVectorDrawableCompat.create(this, temp13 ? R.drawable.hamburger_to_back : R.drawable.back_to_hamburger);
        ImageView imageView = findViewById(R.id.image_view_hamburger);
        imageView.setImageDrawable(animDrawable);
        animDrawable.start();
        temp13 = !temp13;
    }

    boolean temp14 = true;

    public void animate_search_to_close(View view) {
        ImageView v = (ImageView) view;
        AnimatedVectorDrawableCompat animDrawable = AnimatedVectorDrawableCompat.create(this, temp14 ? R.drawable.search_to_close : R.drawable.close_to_search);
        ImageView imageView = findViewById(R.id.image_view_search_to_close);
        imageView.setImageDrawable(animDrawable);
        animDrawable.start();
        temp14 = !temp14;
    }


}

