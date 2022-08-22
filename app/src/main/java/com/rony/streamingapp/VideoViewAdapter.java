package com.rony.streamingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VideoViewAdapter extends RecyclerView.Adapter<VideoViewAdapter.VideoViewViewHolder> {

    Context context;
    List<VideoViewModel> videoViewModelList;

    public VideoViewAdapter() {
    }

    public VideoViewAdapter(Context context, List<VideoViewModel> videoViewModelList) {
        this.context = context;
        this.videoViewModelList = videoViewModelList;
    }

    @NonNull
    @Override
    public VideoViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.video_view_layout, parent, false);
        return new VideoViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewViewHolder holder, int position) {
        VideoViewModel data = videoViewModelList.get(position);
        holder.videoView.setVideoPath(data.getVideo());
    }

    @Override
    public int getItemCount() {
        return videoViewModelList.size();
    }

    public  class VideoViewViewHolder extends RecyclerView.ViewHolder {

        VideoView videoView;

        public VideoViewViewHolder(@NonNull View itemView) {
            super(itemView);

            videoView = itemView.findViewById(R.id.videoView);

        }
    }

}


