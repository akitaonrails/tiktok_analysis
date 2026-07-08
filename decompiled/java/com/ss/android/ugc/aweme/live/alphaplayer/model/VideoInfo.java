package com.ss.android.ugc.aweme.live.alphaplayer.model;

/* JADX INFO: loaded from: classes35.dex */
public class VideoInfo {
    public int duration;
    public int videoHeight;
    public int videoWidth;

    public int getDuration() {
        return this.duration;
    }

    public int getVideoHeight() {
        return this.videoHeight;
    }

    public int getVideoWidth() {
        return this.videoWidth;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public void setVideoWidth(int i) {
        this.videoWidth = i;
    }

    public VideoInfo(int i, int i2) {
        this.videoWidth = i;
        this.videoHeight = i2;
    }

    public VideoInfo(int i, int i2, int i3) {
        this.videoWidth = i;
        this.videoHeight = i2;
        this.duration = i3;
    }
}
