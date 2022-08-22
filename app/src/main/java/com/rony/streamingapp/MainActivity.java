package com.rony.streamingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    VideoView videoView, videoView1, videoView2;
    RecyclerView recyclerView;
    VideoViewAdapter adapter;
    List<VideoViewModel> videoViewModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        videoView = findViewById(R.id.videoView);
        videoView1 = findViewById(R.id.videoView1);
        videoView2 = findViewById(R.id.videoView2);

        /*recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        videoViewModelList = new ArrayList<>();
        adapter =new VideoViewAdapter(this, videoViewModelList);
        recyclerView.setAdapter(adapter);*/

        String videoPath = "android.resource://"+ getPackageName()+"/"+R.raw.change;
        String videoPath1 = "android.resource://"+ getPackageName()+"/"+R.raw.education;
        String videoPath2 = "android.resource://"+ getPackageName()+"/"+R.raw.video3;

        Uri uri = Uri.parse(videoPath);
        Uri uri1 = Uri.parse(videoPath1);
        Uri uri2 = Uri.parse(videoPath2);

        videoView.setVideoURI(uri);
        videoView1.setVideoURI(uri1);
        videoView2.setVideoURI(uri2);

        MediaController mediaController = new MediaController(this);
        MediaController mediaController1 = new MediaController(this);
        MediaController mediaController2 = new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView1.setMediaController(mediaController1);
        videoView2.setMediaController(mediaController2);
        mediaController.setAnchorView(videoView);
        mediaController1.setAnchorView(videoView1);
        mediaController2.setAnchorView(videoView2);

        /*videoViewModelList.add(new VideoViewModel(videoPath));
        videoViewModelList.add(new VideoViewModel(videoPath1));
        videoViewModelList.add(new VideoViewModel(videoPath2));*/



        /*MediaController mediaController =new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);*/



    }

}