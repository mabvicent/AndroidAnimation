package com.example.sqliterecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class AnimationActivity extends AppCompatActivity {
    Button slideup,slidedown,slideleft,slideright;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_animation );
        slideup = findViewById( R.id.btnSlideUp );
        slideup.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = findViewById( R.id.imageview );
                Animation animation = AnimationUtils.loadAnimation( getApplicationContext(),R.anim.slide_up );
                imageView.startAnimation(animation);
            }
        } );
        slidedown = findViewById( R.id.btnSlideDown );
        slidedown.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 ImageView imageView = findViewById( R.id.imageview );
                Animation animation = AnimationUtils.loadAnimation( getApplicationContext(),R.anim.slide_down );
                imageView.startAnimation(animation);
            }
        } );
        slideleft = findViewById( R.id.btnSlideLeft );
        slideleft.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = findViewById( R.id.imageview );
                Animation animation = AnimationUtils.loadAnimation( getApplicationContext(),R.anim.slide_left );
                imageView.startAnimation(animation);

            }
        } );

        slideright = findViewById( R.id.btnSlideRight );
        slideright.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = findViewById( R.id.imageview );
                Animation animation = AnimationUtils.loadAnimation( getApplicationContext(),R.anim.slide_right );
                imageView.startAnimation(animation);
            }
        } );

    }
}
