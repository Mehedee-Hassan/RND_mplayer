package com.example.dell.videostreaming;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    String directVideoUrl = "https://raw.githubusercontent.com/mediaelement/mediaelement-files/master/echo-hereweare.mp4";
//    String directVideoUrl = "http://45.120.114.222/ftp/HDD2/Tamil%20Movies/2017/Jawaan.2017.mkv";
    Uri vidUri = Uri.parse(directVideoUrl);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        initview();
    }

    private void initview() {

        VideoView videoView = (VideoView) findViewById(R.id.myVideo);


        MediaController vidControl = new MediaController(this);
        vidControl.setAnchorView(videoView);
        videoView.setMediaController(vidControl);

        videoView.setVideoURI(vidUri);
        videoView.start();

    }
}
