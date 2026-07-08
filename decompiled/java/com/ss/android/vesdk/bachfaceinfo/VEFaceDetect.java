package com.ss.android.vesdk.bachfaceinfo;

import android.graphics.PointF;
import android.graphics.RectF;
import com.ss.android.ttve.nativePort.TEParcelWrapper;

/* JADX INFO: loaded from: classes34.dex */
public class VEFaceDetect {
    public int action;
    public float eyeDistance;
    public int faceID;
    public TEParcelWrapper parcelWrapper;
    public float pitch;
    public float[] pointVisibility;
    public PointF[] points;
    public RectF rectF;
    public float roll;
    public float score;
    public int trackCount;
    public float yaw;

    public void readFromParcel() {
        TEParcelWrapper tEParcelWrapper = this.parcelWrapper;
        if (tEParcelWrapper == null) {
            return;
        }
        this.rectF = tEParcelWrapper.readRectF();
        this.score = this.parcelWrapper.readFloat();
        this.points = this.parcelWrapper.readPointFArray(106);
        this.pointVisibility = this.parcelWrapper.readFloatArray(106);
        this.yaw = this.parcelWrapper.readFloat();
        this.pitch = this.parcelWrapper.readFloat();
        this.roll = this.parcelWrapper.readFloat();
        this.eyeDistance = this.parcelWrapper.readFloat();
        this.faceID = this.parcelWrapper.readInt();
        this.action = this.parcelWrapper.readInt();
        this.trackCount = this.parcelWrapper.readInt();
    }

    public int getAction() {
        return this.action;
    }

    public float getEyeDistance() {
        return this.eyeDistance;
    }

    public int getFaceID() {
        return this.faceID;
    }

    public float getPitch() {
        return this.pitch;
    }

    public float[] getPointVisibility() {
        return this.pointVisibility;
    }

    public PointF[] getPoints() {
        return this.points;
    }

    public RectF getRectF() {
        return this.rectF;
    }

    public float getRoll() {
        return this.roll;
    }

    public float getScore() {
        return this.score;
    }

    public int getTrackCount() {
        return this.trackCount;
    }

    public float getYaw() {
        return this.yaw;
    }

    public void setAction(int i) {
        this.action = i;
    }

    public void setEyeDistance(float f) {
        this.eyeDistance = f;
    }

    public void setFaceID(int i) {
        this.faceID = i;
    }

    public void setParcelWrapper(TEParcelWrapper tEParcelWrapper) {
        this.parcelWrapper = tEParcelWrapper;
    }

    public void setPitch(float f) {
        this.pitch = f;
    }

    public void setPointVisibility(float[] fArr) {
        this.pointVisibility = fArr;
    }

    public void setPoints(PointF[] pointFArr) {
        this.points = pointFArr;
    }

    public void setRectF(RectF rectF) {
        this.rectF = rectF;
    }

    public void setRoll(float f) {
        this.roll = f;
    }

    public void setScore(float f) {
        this.score = f;
    }

    public void setTrackCount(int i) {
        this.trackCount = i;
    }

    public void setYaw(float f) {
        this.yaw = f;
    }
}
