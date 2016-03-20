package com.example.pp.fiveanimationsfromkyotoanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView freeRedirectImageView, haruhiRedirectImageView,
                    konRedirectImageView, loveRedirectImageView, soundRedirectImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        freeRedirectImageView = (ImageView)findViewById(R.id.freeRedirect);
        haruhiRedirectImageView = (ImageView)findViewById(R.id.haruhiRedirect);
        konRedirectImageView = (ImageView)findViewById(R.id.konRedirect);
        loveRedirectImageView = (ImageView)findViewById(R.id.loveRedirect);
        soundRedirectImageView = (ImageView)findViewById(R.id.soundRedirect);

        freeRedirectImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchMainFreeActivity= new Intent(MainActivity.this, MainFreeActivity.class);
                startActivity(launchMainFreeActivity);
            }
        });

        haruhiRedirectImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchMainHaruhiActivity= new Intent(MainActivity.this, MainHaruhiActivity.class);
                startActivity(launchMainHaruhiActivity);
            }
        });

        konRedirectImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchMainKOnActivity= new Intent(MainActivity.this, MainKOnActivity.class);
                startActivity(launchMainKOnActivity);
            }
        });

        loveRedirectImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchMainLoveActivity= new Intent(MainActivity.this, MainLoveActivity.class);
                startActivity(launchMainLoveActivity);
            }
        });

        soundRedirectImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchMainSoundActivity= new Intent(MainActivity.this, MainSoundActivity.class);
                startActivity(launchMainSoundActivity);
            }
        });
    }


}
