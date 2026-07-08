package com.ss.android.vesdk.algorithm.model;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes36.dex */
public class FDetect {
    public float ED;
    public int FID;
    public int action;
    public FaceExtInfo faceExtInfo;
    public float pitch;
    public float[] pointVisibility;
    public PointF[] points;
    public FaceRectInfo rect;
    public float roll;
    public float score;
    public int trackCount;
    public float yaw;

    /* JADX INFO: loaded from: classes34.dex */
    public static class FaceExtInfo {
        public PointF[] eyeBrowLeftPoints;
        public PointF[] eyeBrowRightPoints;
        public int eyeCount;
        public PointF[] eyeLeftPoints;
        public PointF[] eyeRightPoints;
        public int eyebrowCount;
        public int irisCount;
        public PointF[] irisLeftPoints;
        public PointF[] irisRightPoints;
        public int lipCount;
        public PointF[] lipPoints;
    }

    public static class FaceRectInfo {
        public int height;
        public int originX;
        public int originY;
        public int width;
    }

    public int getAction() {
        return this.action;
    }

    public float getED() {
        return this.ED;
    }

    public int getFID() {
        return this.FID;
    }

    public FaceExtInfo getFaceExtInfo() {
        return this.faceExtInfo;
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

    public FaceRectInfo getRect() {
        return this.rect;
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

    public void setED(float f) {
        this.ED = f;
    }

    public void setFID(int i) {
        this.FID = i;
    }

    public void setFaceExtInfo(FaceExtInfo faceExtInfo) {
        this.faceExtInfo = faceExtInfo;
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

    public void setRect(FaceRectInfo faceRectInfo) {
        this.rect = faceRectInfo;
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
