# AnimationExamples
A simple xml animation of a bouncing ball in Android. 

Required:

`ball.xml`
A simple red oval shape, under the `drawable` resource directory

```
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="oval">
            <solid android:color="#ff0000" />
        </shape>
    </item>
</selector>
```

`bounce.xml`
The simple bounce animation, under the `anim` resource directory

```
<?xml version="1.0" encoding="utf-8"?>
<set xmlns:android="http://schemas.android.com/apk/res/android">
    <translate
        android:fromYDelta="-200"
        android:toYDelta="200"
        android:repeatCount="infinite"
        android:repeatMode="reverse"
        android:duration="1000"
        android:interpolator="@android:interpolator/bounce"/>

    <scale
        android:duration="1000"
        android:fromXScale="1"
        android:fromYScale="1"
        android:pivotX="50%"
        android:pivotY="50%"
        android:toXScale="1.5"
        android:toYScale="1"
        android:repeatCount="infinite"
        android:repeatMode="reverse"/>
</set>
```

Once you have the above, create an imageview in your xml layout:

```
<ImageView
    android:id="@+id/ball"
    android:layout_width="30dp"
    android:layout_height="30dp"
    android:src="@drawable/ball"
    android:layout_centerInParent="true"/>
```

Use the code below in your activity:

```
ImageView ball = (ImageView) findViewById(R.id.ball); // get your imageview

Animation bounce = AnimationUtils.loadAnimation(getBaseContext(), R.anim.bounce); // load the animation from the resource

ball.startAnimation(bounce); // animate the imageview
```
