package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button getFortune = (Button)findViewById(R.id.fortuneButton);
        final ImageView fortune = (ImageView)findViewById(R.id.fortuneImage);
        final Random randInt = new Random();
        final int[] fortunes = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        getFortune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int get = randInt.nextInt(5);
                fortune.setImageResource(fortunes[get]);
            }
        });
    }
}
