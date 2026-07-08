package com.ss.lyrax.transcoder;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxTranscoderOrientation {
    public float orientationX;
    public float orientationY;
    public float orientationZ;

    public float getOrientationX() {
        return this.orientationX;
    }

    public float getOrientationY() {
        return this.orientationY;
    }

    public float getOrientationZ() {
        return this.orientationZ;
    }

    public void setOrientationX(float f) {
        this.orientationX = f;
    }

    public void setOrientationY(float f) {
        this.orientationY = f;
    }

    public void setOrientationZ(float f) {
        this.orientationZ = f;
    }

    public LyraxTranscoderOrientation(float f, float f2, float f3) {
        this.orientationX = f;
        this.orientationY = f2;
        this.orientationZ = f3;
    }
}
