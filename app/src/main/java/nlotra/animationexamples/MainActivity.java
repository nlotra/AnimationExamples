package nlotra.animationexamples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // quick proof of concept bouncing ball animation

        final ImageView ball = (ImageView) findViewById(R.id.ball);

        final Animation bounce = AnimationUtils.loadAnimation(getBaseContext(), R.anim.bounce);

        ball.startAnimation(bounce);
    }
}
