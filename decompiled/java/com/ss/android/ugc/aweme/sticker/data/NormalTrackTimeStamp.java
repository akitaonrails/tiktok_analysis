package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public class NormalTrackTimeStamp extends BaseTrackTimeStamp {

    @C09CT("end_time")
    public float endTime;

    @C09CT("h")
    public float height;

    @C09CT("r")
    public float rotation;
    public Float scale;

    @C09CT("s")
    public Float scaleForIos;

    @C09CT("start_time")
    public float startTime;

    @C09CT("w")
    public float width;
    public float x;
    public float y;

    public Float getScale() {
        Float f = this.scale;
        if (f != null) {
            return f;
        }
        Float f2 = this.scaleForIos;
        return f2 != null ? f2 : Float.valueOf(1.0f);
    }

    public boolean timeIsValid() {
        float f = this.startTime;
        if (f < 0.0f) {
            return false;
        }
        float f2 = this.endTime;
        return f2 > 0.0f && f <= f2;
    }

    public NormalTrackTimeStamp() {
        this.startTime = -1.0f;
        this.endTime = -1.0f;
    }

    public boolean isWholeDuration() {
        return !timeIsValid();
    }

    public float getEndTime() {
        return this.endTime;
    }

    public float getHeight() {
        return this.height;
    }

    public float getRotation() {
        return this.rotation;
    }

    public Float getScaleForIos() {
        return this.scaleForIos;
    }

    public float getStartTime() {
        return this.startTime;
    }

    public float getWidth() {
        return this.width;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public NormalTrackTimeStamp(int i) {
        super(i);
        this.startTime = -1.0f;
        this.endTime = -1.0f;
    }

    public void setEndTime(float f) {
        this.endTime = f;
    }

    public void setHeight(float f) {
        this.height = f;
    }

    public void setRotation(float f) {
        this.rotation = f;
    }

    public void setScale(Float f) {
        this.scaleForIos = f;
    }

    public void setScaleForIos(Float f) {
        this.scaleForIos = f;
    }

    public void setStartTime(float f) {
        this.startTime = f;
    }

    public void setWidth(float f) {
        this.width = f;
    }

    public void setX(float f) {
        this.x = f;
    }

    public void setY(float f) {
        this.y = f;
    }
}
