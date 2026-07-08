package com.ss.bytertc.engine;

import com.ss.bytertc.engine.video.ScreenSharingParameters;

/* JADX INFO: loaded from: classes36.dex */
public class InternalScreenSharingParams {
    public int bitrate;
    public int frameRate;
    public int maxHeight;
    public int maxWidth;
    public int minBitrate;

    public int getBitrate() {
        return this.bitrate;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public int getHeight() {
        return this.maxHeight;
    }

    public int getMinBitrate() {
        return this.minBitrate;
    }

    public int getWidth() {
        return this.maxWidth;
    }

    public InternalScreenSharingParams(ScreenSharingParameters screenSharingParameters) {
        this.frameRate = 15;
        this.bitrate = -1;
        if (screenSharingParameters != null) {
            this.maxHeight = screenSharingParameters.maxHeight;
            this.maxWidth = screenSharingParameters.maxWidth;
            this.frameRate = screenSharingParameters.frameRate;
            this.bitrate = screenSharingParameters.bitrate;
            this.minBitrate = screenSharingParameters.minBitrate;
        }
    }

    public InternalScreenSharingParams(int i, int i2, int i3, int i4, int i5) {
        this.maxHeight = i2;
        this.maxWidth = i;
        this.frameRate = i3;
        this.bitrate = i4;
        this.minBitrate = i5;
    }
}
