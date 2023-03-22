package com.ryc.coparealjuego;


import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class ConfActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configuracion);

        Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.blink);
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setVisibility(View.VISIBLE);
        textView3.startAnimation(anim1);

    }
}
