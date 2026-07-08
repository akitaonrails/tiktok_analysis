package com.bytedance.bmf_mods_lite_api.packageHandler;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes36.dex */
public interface VideoFrameApi {
    int clearData();

    long getNativePtr();

    int getVideoFrameFormat();

    int getVideoFrameHeight();

    int getVideoFrameTexture();

    int getVideoFrameWidth();

    void release();

    int setVideoFrame(int i, int i2, int i3, int i4, int i5);

    int setVideoFrame(Bitmap bitmap, int i, int i2, int i3);
}
