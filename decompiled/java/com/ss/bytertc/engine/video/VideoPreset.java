package com.ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes19.dex */
public class VideoPreset {
    public int bandwidth;
    public int fps;
    public int height;
    public int width;

    public int getBandwidth() {
        return this.bandwidth;
    }

    public int getFps() {
        return this.fps;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public VideoPreset(int i, int i2, int i3, int i4) {
        this.width = i;
        this.height = i2;
        this.fps = i3;
        this.bandwidth = i4;
    }
}
