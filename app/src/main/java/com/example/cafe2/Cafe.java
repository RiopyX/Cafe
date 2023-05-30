package com.example.cafe2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Cafe extends AppCompatActivity {

    ImageView imgGuest, imgCafe;
    Button btnMenu, btnScote;
    TextView moneyView;
    int money = 0;
    int toast;
    private final Handler handler = new Handler();
    private final int GUEST_ANIMATION_DURATION = 4000;
    private final int GUEST_LEAVE_DELAY = 2000;

    int[] guests = {
            R.drawable.guest7, R.drawable.guest6,
            R.drawable.guest5, R.drawable.guest4,
            R.drawable.guest3, R.drawable.guest2,
            R.drawable.guest1, R.drawable.guest8};
    int[] superguests = {
            R.drawable.superguest11, R.drawable.superguest4,
            R.drawable.superguest9, R.drawable.superguest8,
            R.drawable.superguest7, R.drawable.superguest6,
            R.drawable.superguest5, R.drawable.superguest4,
            R.drawable.superguest3, R.drawable.superguest2,
            R.drawable.superguest1};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);
        imgCafe = findViewById(R.id.Cafe);
        imgGuest = findViewById(R.id.guest);
        btnMenu = findViewById(R.id.btnMenu);
        btnScote = findViewById(R.id.btnScote);
        moneyView = findViewById(R.id.moneyView);
        Animation cafeStart = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.cafe_start);
        Animation buttonAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_anim);
        btnMenu.startAnimation(buttonAnim);
        btnScote.startAnimation(buttonAnim);
        imgCafe.startAnimation(cafeStart);
        cafeStart.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                setImage();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
        imgCafe.startAnimation(cafeStart);
    }

    public void setImage() {
            Random random2 = new Random();
            int number = random2.nextInt();
            int[] selectedArray = (number <= 10) ? superguests:guests;
            int randomIndex = random2.nextInt(selectedArray.length);
            int randomImage = selectedArray[randomIndex];
            imgGuest.setImageResource(randomImage);
            Animation guestAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.guests);
            guestAnimation.setDuration(GUEST_ANIMATION_DURATION);
            guestAnimation.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {

                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    handler.postDelayed(() -> {
                        Animation leaveAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.guests_leave);
                        leaveAnimation.setAnimationListener(new Animation.AnimationListener() {
                            @Override
                            public void onAnimationStart(Animation animation) {

                            }

                            @Override
                            public void onAnimationEnd(Animation animation) {
                                if (number <= 10){
                                    toast = 7;
                                    money = money + 7;
                                } else {
                                    toast = 3;
                                    money = money +3;
                                }
                                String message = String.valueOf(toast);
                                String Money = String.valueOf(money);
                                Toast toast = new Toast(getApplicationContext());
                                View toastView = getLayoutInflater().inflate(R.layout.custom_toast, null);
                                toast.setView(toastView);
                                toast.setDuration(Toast.LENGTH_SHORT);
                                toastView.setBackgroundResource(R.drawable.transparent_toast_background);
                                TextView toastText = toastView.findViewById(R.id.toastView);
                                toastText.setText("+ " + message);
                                toast.setGravity(Gravity.CENTER, 0, -30);
                                toast.show();
                                moneyView.setText(Money);
                                setImage();
                            }

                            @Override
                            public void onAnimationRepeat(Animation animation) {

                            }
                        });
                        imgGuest.startAnimation(leaveAnimation);
                    }, GUEST_LEAVE_DELAY);
                }

                @Override
                public void onAnimationRepeat(Animation animation) {

                }
            });
            imgGuest.startAnimation(guestAnimation);
    }
    public void onMenuClick(View view) {
        Intent intent = new Intent(Cafe.this, menu.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void OnScoteClick(View view) {
        Intent intent = new Intent(Cafe.this, Scote.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}