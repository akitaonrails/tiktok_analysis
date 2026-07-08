package com.ss.lyrax.video;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoPlatformCaptureConfig {
    public int framerate;
    public int height;
    public String jsonParams;
    public int width;

    public LyraxVideoPlatformCaptureConfig() {
        this.jsonParams = "";
    }

    public int getFramerate() {
        return this.framerate;
    }

    public int getHeight() {
        return this.height;
    }

    public String getJsonParams() {
        return this.jsonParams;
    }

    public int getWidth() {
        return this.width;
    }

    public LyraxVideoPlatformCaptureConfig(int i, int i2, int i3, String str) {
        this.width = i;
        this.height = i2;
        this.framerate = i3;
        this.jsonParams = str;
    }
}
