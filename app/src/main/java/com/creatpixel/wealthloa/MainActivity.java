package com.creatpixel.wealthloa;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView backgroundVideo;
    LinearLayout thirdBackround;
    Button buttonAttractMoney;
    Button buttonThing;
    Button button369;

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set background video when app start
        backgroundVideo = findViewById(R.id.backrgoundVideo);
        backgroundVideo.setVideoPath("android.resource://"+ getPackageName() +"/"+ R.raw.backroundvideo);
        backgroundVideo.start();
        //Set background when app start
        thirdBackround = findViewById(R.id.thirdBackround);
        buttonAttractMoney = findViewById(R.id.buttonDigitalMoney);
        buttonThing = findViewById(R.id.buttonThing);
        button369 = findViewById(R.id.button369);

        //Make background loop
        backgroundVideo.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        onClicks();
        fadeEffect();
    }

    public void fadeEffect(){
        button369.animate().alpha(1).setDuration(4369);
        buttonThing.animate().alpha(1).setDuration(3369);
        buttonAttractMoney.animate().alpha(1).setDuration(2369);
        thirdBackround.animate().alpha(0).setDuration(10000);
    }

    public void onClicks(){
        buttonAttractMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attractMoneyOptionPage();
            }
        });
    }

    public void attractMoneyOptionPage(){
        Intent intent = new Intent(this, fillUpPage.class);
        startActivity(intent);
    }
}