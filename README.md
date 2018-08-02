# Android Icon Animations - Ready to use XML files

### Preview

<img src="https://github.com/huzefabagwala/android_animations/blob/master/Preview%20Master.gif" width="500">

# Compatibility
Android Gingerbread 2.3+

# How Do I Use It?

- Just call the XML file to an `AppCompatImageView`

```
<android.support.v7.widget.AppCompatImageView
            android:id="@+id/image_view_play_to_pause"
            android:layout_width="100dp"
            android:layout_height="100dp"
            android:onClick="animate_play_to_pause"
            app:srcCompat="@drawable/play_to_pause" />
```

- Animator 1
```
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
```

- Animator 2 (For animations which has two different visual states)
```
boolean temp1 = true;

    public void animate_play_to_pause(View view) {
        ImageView v = (ImageView) view;
        AnimatedVectorDrawableCompat animDrawable = AnimatedVectorDrawableCompat.create(this, temp1 ? R.drawable.play_to_pause : R.drawable.pause_to_play);
        ImageView imageView = findViewById(R.id.image_view_play_to_pause);
        imageView.setImageDrawable(animDrawable);
        animDrawable.start();
        temp1 = !temp1;
    }
```

### Download the Preview APK [HERE](https://github.com/huzefabagwala/android_animations/blob/master/Sample/app-debug.apk "Sample APK")

### Check this project on [Dribbble](https://dribbble.com/shots/4905239-Android-Icon-Animations-Ready-to-use-XML-files)

