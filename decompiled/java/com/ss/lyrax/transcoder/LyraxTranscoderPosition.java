package com.ss.lyrax.transcoder;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxTranscoderPosition {
    public float positionX;
    public float positionY;
    public float positionZ;

    public LyraxTranscoderPosition() {
        this(0.0f, 0.0f, 0.0f);
    }

    public float getPositionX() {
        return this.positionX;
    }

    public float getPositionY() {
        return this.positionY;
    }

    public float getPositionZ() {
        return this.positionZ;
    }

    public void setPositionX(float f) {
        this.positionX = f;
    }

    public void setPositionY(float f) {
        this.positionY = f;
    }

    public void setPositionZ(float f) {
        this.positionZ = f;
    }

    public LyraxTranscoderPosition(float f, float f2, float f3) {
        this.positionX = f;
        this.positionY = f2;
        this.positionZ = f3;
    }
}
