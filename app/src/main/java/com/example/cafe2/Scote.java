package com.example.cafe2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Scote extends AppCompatActivity {

    ImageButton btnBlue, btnGreen, btnPink, btnValentine, btnCats, btnBrown;

    List<Integer> blueList = new ArrayList<>(Arrays.asList(
            R.drawable.menu_blue1, R.drawable.menu_blue2,
            R.drawable.menu_blue3,
            R.drawable.menu_blue4, R.drawable.menu_blue5,
            R.drawable.menu_blue6, R.drawable.menu_blue7,
            R.drawable.menu_blue8, R.drawable.menu_blue9,
            R.drawable.menu_blue10, R.drawable.menu_blue11
    ));

    List<Integer> brownList = new ArrayList<>(Arrays.asList(
            R.drawable.menu_brown1, R.drawable.menu_brown2,
            R.drawable.menu_brown3, R.drawable.menu_brown4,
            R.drawable.menu_brown5, R.drawable.menu_brown6,
            R.drawable.menu_brown7, R.drawable.menu_brown8,
            R.drawable.menu_brown9
    ));

    List<Integer> catsList = new ArrayList<>(Arrays.asList(
            R.drawable.menu_cats1, R.drawable.menu_cats2,
            R.drawable.menu_cats3, R.drawable.menu_cats4,
            R.drawable.menu_cats5, R.drawable.menu_cats6,
            R.drawable.menu_cats7, R.drawable.menu_cats8,
            R.drawable.menu_cats9
    ));

    List<Integer> greenList = new ArrayList<>(Arrays.asList(
            R.drawable.menu_green1, R.drawable.menu_green2,
            R.drawable.menu_green3, R.drawable.menu_green4,
            R.drawable.menu_green5, R.drawable.menu_green6,
            R.drawable.menu_green7, R.drawable.menu_green8,
            R.drawable.menu_green9
    ));

    List<Integer> pinkList = new ArrayList<>(Arrays.asList(
            R.drawable.menu_pink1, R.drawable.menu_pink2,
            R.drawable.menu_pink3, R.drawable.menu_pink4,
            R.drawable.menu_pink5, R.drawable.menu_pink6,
            R.drawable.menu_pink7, R.drawable.menu_pink8,
            R.drawable.menu_pink9
    ));

    List<Integer> valentineList = new ArrayList<>(Arrays.asList(
            R.drawable.menu_valentine1, R.drawable.menu_valentine2,
            R.drawable.menu_valentine3, R.drawable.menu_valentine4,
            R.drawable.menu_valentine5, R.drawable.menu_valentine6,
            R.drawable.menu_valentine7, R.drawable.menu_valentine8
    ));

    int[] blue = {};
    int[] brown = {};
    int[] cats = {};
    int[] green = {};
    int[] pink = {};
    int[] valentine = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scote);
        ScrollView scrollView = findViewById(R.id.scrollView);
        scrollView.setScrollbarFadingEnabled(true);
        btnBlue = findViewById(R.id.btnBlue);
        btnBrown = findViewById(R.id.btnBrown);
        btnCats = findViewById(R.id.btnCats);
        btnGreen = findViewById(R.id.btnGreen);
        btnPink = findViewById(R.id.btnPink);
        btnValentine = findViewById(R.id.btnValentine);

    }

    public void onClickBlue(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.scote_scale);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Random random = new Random();
                int number = random.nextInt(blueList.size());
                int index = blueList.get(number);
                blue[number] = index;
                btnBlue.setImageResource(index);
                blueList.remove(number);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        btnBlue.startAnimation(animation);

    }

    public void onClickBrown(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.scote_scale);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Random random = new Random();
                int number = random.nextInt(brownList.size());
                int index = brownList.get(number);
                brown[number] = index;
                btnBrown.setImageResource(index);
                brownList.remove(number);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        btnBrown.startAnimation(animation);
    }
    public void onClickCats(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.scote_scale);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Random random = new Random();
                int number = random.nextInt(catsList.size());
                int index = catsList.get(number);
                cats[number] = index;
                btnCats.setImageResource(index);
                catsList.remove(number);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        btnCats.startAnimation(animation);

    }
    public void onClickGreen(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.scote_scale);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Random random = new Random();
                int number = random.nextInt(greenList.size());
                int index = greenList.get(number);
                green[number] = index;
                btnGreen.setImageResource(index);
                greenList.remove(number);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        btnGreen.startAnimation(animation);

    }
    public void onClickPink(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.scote_scale);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Random random = new Random();
                int number = random.nextInt(pinkList.size());
                int index = pinkList.get(number);
                pink[number] = index;
                btnPink.setImageResource(index);
                pinkList.remove(number);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        btnPink.startAnimation(animation);

    }
    public void onClickValentine(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.scote_scale);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Random random = new Random();
                int number = random.nextInt(valentineList.size());
                int index = valentineList.get(number);
                valentine[number] = index;
                btnValentine.setImageResource(index);
                valentineList.remove(number);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        btnValentine.startAnimation(animation);

    }
}