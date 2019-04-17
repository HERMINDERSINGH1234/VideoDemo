package com.example.sunshine.videodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.VideoView;import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoView= (VideoView) findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.demovideo);
        // to add the controllers to the vedio so that in this we can use.

        MediaController mediaController= new MediaController(this);

        // to connect the link between MediaController to the videoView

        mediaController.setAnchorView(videoView);

        // to connect  the link between videoView to the mediaController ..

        videoView.setMediaController(mediaController);

        videoView.start();
    }
}
