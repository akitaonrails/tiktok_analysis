package com.ss.android.ugc.aweme.services.external.ability.camera;

import android.content.Context;
import android.graphics.Point;

/* JADX INFO: loaded from: classes36.dex */
public class AVCameraParams {
    public static final String[] sCameraSceneMode = {"auto", "portrait", "party", "sunset", "candlelight", "night", "hdr", "action", "landscape", "snow"};
    public boolean enableFallBack;
    public boolean enableMTKZsl;
    public boolean enableTakePictureOpt;
    public boolean enableVideoStabilization;
    public boolean isMTKPlatform;
    public int mCameraHardwareSupportLevel;
    public Point mCameraPictureSize;
    public Context mContext;
    public int mFpsRangeMax;
    public int mFpsRangeMin;
    public int mHeight;
    public byte mOptionFlags;
    public int mOutputType;
    public int mPicHeight;
    public int mPicWidth;
    public String mSceneMode;
    public int mType;
    public int mWidth;

    public interface CameraMode {
    }

    public boolean isValid() {
        int i;
        return this.mContext != null && this.mWidth > 0 && this.mHeight > 0 && (i = this.mFpsRangeMin) > 0 && this.mFpsRangeMax >= i;
    }

    public Point getCameraPictureSize() {
        return this.mCameraPictureSize;
    }

    public boolean isEnableTakePictrueOpt() {
        return this.enableTakePictureOpt;
    }

    public void setCameraPictureSize(Point point) {
        this.mCameraPictureSize = point;
    }

    public void setOutputMode(int i) {
        this.mOutputType = i;
    }

    public AVCameraParams(Context context, int i) {
        this.mFpsRangeMin = 7;
        this.mFpsRangeMax = 30;
        this.mWidth = 1280;
        this.mHeight = 720;
        this.mPicWidth = -1;
        this.mPicHeight = -1;
        this.mOutputType = 1;
        this.mCameraHardwareSupportLevel = 1;
        this.mOptionFlags = (byte) 1;
        this.mSceneMode = "auto";
        this.enableFallBack = true;
        this.mContext = context;
        this.mType = i;
    }

    public AVCameraParams(Context context, int i, int i2, int i3) {
        this.mFpsRangeMin = 7;
        this.mFpsRangeMax = 30;
        this.mPicWidth = -1;
        this.mPicHeight = -1;
        this.mOutputType = 1;
        this.mCameraHardwareSupportLevel = 1;
        this.mOptionFlags = (byte) 1;
        this.mSceneMode = "auto";
        this.enableFallBack = true;
        this.mContext = context;
        this.mType = i;
        this.mWidth = i2;
        this.mHeight = i3;
    }

    public AVCameraParams(Context context, int i, int i2, int i3, int i4, int i5) {
        this(context, i, i2, i3, i4, i5, false);
    }

    public AVCameraParams(Context context, int i, int i2, int i3, int i4, int i5, boolean z) {
        this.mFpsRangeMin = 7;
        this.mFpsRangeMax = 30;
        this.mOutputType = 1;
        this.mCameraHardwareSupportLevel = 1;
        this.mOptionFlags = (byte) 1;
        this.mSceneMode = "auto";
        this.enableFallBack = true;
        this.mContext = context;
        this.mType = i;
        this.mWidth = i2;
        this.mHeight = i3;
        this.mPicWidth = i4;
        this.mPicHeight = i5;
        this.enableTakePictureOpt = i4 > 0 && i5 > 0;
        this.enableMTKZsl = z;
    }
}
