package com.ryc.coparealjuego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.blink);
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setVisibility(View.VISIBLE);
        textView3.startAnimation(anim1);

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.scale);
        ImageView imageView2 = findViewById(R.id.imageView2);
        imageView2.startAnimation(anim);

        View mainView = findViewById(R.id.MainActivity);
        mainView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PrincipalActivity.class);
                startActivity(intent);
            }
        });
    }
}