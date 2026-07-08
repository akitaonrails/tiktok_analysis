package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes21.dex */
public class InternalVideoCaptureConfig {
    public int capturePreference;
    public int frameRate;
    public int height;
    public int width;

    public int getCapturePreference() {
        return this.capturePreference;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public InternalVideoCaptureConfig(int i, int i2, int i3, int i4) {
        this.capturePreference = i;
        this.width = i2;
        this.height = i3;
        this.frameRate = i4;
    }
}
