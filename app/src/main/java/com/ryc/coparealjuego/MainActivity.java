package com.ryc.coparealjuego;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView vv_fondo;

    MediaPlayer mMediaPlayer;

    int mCurrentVideoPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vv_fondo = findViewById(R.id.vv_fondo);



        Uri uri = Uri.parse("android.resource://"

                + getPackageName()

                + "/"

                + R.raw.paisaje_fondo

        );



        vv_fondo.setVideoURI(uri);



        vv_fondo.start();





        vv_fondo.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

            @Override

            public void onPrepared(MediaPlayer mediaPlayer) {

                mMediaPlayer = mediaPlayer;



                mMediaPlayer.setLooping(true);



                if(mCurrentVideoPosition != 0){

                    mMediaPlayer.seekTo(mCurrentVideoPosition);

                    mMediaPlayer.start();

                }

            }

        });



    }





    @Override

    protected void onPause() {

        super.onPause();



        mCurrentVideoPosition = mMediaPlayer.getCurrentPosition();

        vv_fondo.pause();

    }



    @Override

    protected void onResume() {

        super.onResume();



        vv_fondo.start();

    }



    @Override

    protected void onDestroy() {

        super.onDestroy();



        mMediaPlayer.release();

        mMediaPlayer = null;

    }
}