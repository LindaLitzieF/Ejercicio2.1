package com.example.ejercicio21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class ActivityVideo extends AppCompatActivity {


    private VideoView videoView2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);


        videoView2 =(VideoView)findViewById(R.id.videoView2);

        Uri videoUri = Uri.parse(getIntent().getExtras().getString("videoUri"));
        videoView2.setVideoURI(videoUri);
        videoView2.start();
    }


}