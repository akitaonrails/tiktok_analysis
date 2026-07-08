package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes36.dex */
public class InternalSubscribeVideoBaseline {
    public int acceptableBadVideoFpsBaseline;
    public int acceptableBadVideoPixelBaseline;
    public int acceptableGoodVideoFpsBaseline;
    public int acceptableGoodVideoPixelBaseline;
    public int acceptableMinVideoResolutionHeight;
    public int acceptableMinVideoResolutionWidth;
    public int streamPriority;

    public int getAcceptableBadVideoFpsBaseline() {
        return this.acceptableBadVideoFpsBaseline;
    }

    public int getAcceptableBadVideoPixelBaseline() {
        return this.acceptableBadVideoPixelBaseline;
    }

    public int getAcceptableGoodVideoFpsBaseline() {
        return this.acceptableGoodVideoFpsBaseline;
    }

    public int getAcceptableGoodVideoPixelBaseline() {
        return this.acceptableGoodVideoPixelBaseline;
    }

    public int getAcceptableMinVideoResolutionHeight() {
        return this.acceptableMinVideoResolutionHeight;
    }

    public int getAcceptableMinVideoResolutionWidth() {
        return this.acceptableMinVideoResolutionWidth;
    }

    public int getStreamPriority() {
        return this.streamPriority;
    }

    public InternalSubscribeVideoBaseline(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.acceptableGoodVideoPixelBaseline = i;
        this.acceptableGoodVideoFpsBaseline = i2;
        this.acceptableBadVideoPixelBaseline = i3;
        this.acceptableBadVideoFpsBaseline = i4;
        this.acceptableMinVideoResolutionWidth = i5;
        this.acceptableMinVideoResolutionHeight = i6;
        this.streamPriority = i7;
    }
}
