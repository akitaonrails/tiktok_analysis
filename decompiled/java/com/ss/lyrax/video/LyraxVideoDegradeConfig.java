package com.ss.lyrax.video;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoDegradeConfig {
    public int downThresholdKbps;
    public int framerate;
    public int height;
    public int upThresholdKbps;
    public int width;

    public int getDownThresholdKbps() {
        return this.downThresholdKbps;
    }

    public int getFramerate() {
        return this.framerate;
    }

    public int getHeight() {
        return this.height;
    }

    public int getUpThresholdKbps() {
        return this.upThresholdKbps;
    }

    public int getWidth() {
        return this.width;
    }

    public static LyraxVideoDegradeConfig create(int i, int i2, int i3, int i4, int i5) {
        LyraxVideoDegradeConfig lyraxVideoDegradeConfig = new LyraxVideoDegradeConfig();
        lyraxVideoDegradeConfig.width = i;
        lyraxVideoDegradeConfig.height = i2;
        lyraxVideoDegradeConfig.framerate = i3;
        lyraxVideoDegradeConfig.upThresholdKbps = i4;
        lyraxVideoDegradeConfig.downThresholdKbps = i5;
        return lyraxVideoDegradeConfig;
    }
}
