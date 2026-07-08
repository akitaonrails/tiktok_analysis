package com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model;

/* JADX INFO: loaded from: classes4.dex */
public final class PictureInfoOpt {
    public AlgorithmData algorithmData;
    public long duration;
    public long frameTimeStamp;
    public boolean hasAudio;
    public int height;
    public boolean isVideo;
    public boolean needFeature;
    public String path;
    public long picDataSize;
    public int resizeHeight;
    public String resizePath;
    public int resizeWidth;
    public int rotation;
    public int width;

    public PictureInfoOpt() {
        this(false, false, 0L, 0L, "", 0, 0, 0, false, 0, 0, "", 0L, null);
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public final void setAlgorithmData(AlgorithmData algorithmData) {
        this.algorithmData = algorithmData;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setFrameTimeStamp(long j) {
        this.frameTimeStamp = j;
    }

    public final void setHasAudio(boolean z) {
        this.hasAudio = z;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setNeedFeature(boolean z) {
        this.needFeature = z;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setPicDataSize(long j) {
        this.picDataSize = j;
    }

    public final void setResizeHeight(int i) {
        this.resizeHeight = i;
    }

    public final void setResizePath(String str) {
        this.resizePath = str;
    }

    public final void setResizeWidth(int i) {
        this.resizeWidth = i;
    }

    public final void setRotation(int i) {
        this.rotation = i;
    }

    public final void setVideo(boolean z) {
        this.isVideo = z;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public PictureInfoOpt(boolean z, boolean z2, long j, long j2, String str, int i, int i2, int i3, boolean z3, int i4, int i5, String str2, long j3, AlgorithmData algorithmData) {
        this.needFeature = z;
        this.isVideo = z2;
        this.frameTimeStamp = j;
        this.duration = j2;
        this.path = str;
        this.width = i;
        this.height = i2;
        this.rotation = i3;
        this.hasAudio = z3;
        this.resizeWidth = i4;
        this.resizeHeight = i5;
        this.resizePath = str2;
        this.picDataSize = j3;
        this.algorithmData = algorithmData;
    }
}
