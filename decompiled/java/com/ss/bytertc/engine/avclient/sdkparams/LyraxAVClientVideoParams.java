package com.ss.bytertc.engine.avclient.sdkparams;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class LyraxAVClientVideoParams {

    @C09CT("width")
    public int width = 360;

    @C09CT("height")
    public int height = 640;

    @C09CT("fps")
    public int fps = 2;

    @C09CT("maxBitrate")
    public int maxBitrate = 1200000;

    @C09CT("minBitrate")
    public int minBitrate = 800000;

    public final int getFps() {
        return this.fps;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getMaxBitrate() {
        return this.maxBitrate;
    }

    public final int getMinBitrate() {
        return this.minBitrate;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setMinBitrate(int i) {
        this.minBitrate = i;
    }
}
