package com.example.cafe2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;

public class Scote extends AppCompatActivity {

    ImageButton btnBlue, btnGreen, btnPink, btnValentine, btnCats, btnBrown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scote);
        ScrollView scrollView = findViewById(R.id.scrollView);
        scrollView.setScrollbarFadingEnabled(false);
        btnBlue = findViewById(R.id.btnBlue);
        btnBrown = findViewById(R.id.btnBrown);
        btnCats = findViewById(R.id.btnCats);
        btnGreen = findViewById(R.id.btnGreen);
        btnPink = findViewById(R.id.btnPink);
        btnValentine = findViewById(R.id.btnValentine);

    }

    public void onClickBlue(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scote_anim);
        btnBlue.startAnimation(animation);

    }

    public void onClickBrown(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scote_anim);
        btnBrown.startAnimation(animation);

    }
    public void onClickCats(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scote_anim);
        btnCats.startAnimation(animation);

    }
    public void onClickGreen(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scote_anim);
        btnGreen.startAnimation(animation);

    }
    public void onClickPink(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scote_anim);
        btnPink.startAnimation(animation);

    }
    public void onClickValentine(View view) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scote_anim);
        btnValentine.startAnimation(animation);

    }
}