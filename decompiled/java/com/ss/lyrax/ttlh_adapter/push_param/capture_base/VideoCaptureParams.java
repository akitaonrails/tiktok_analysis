package com.ss.lyrax.ttlh_adapter.push_param.capture_base;

/* JADX INFO: loaded from: classes21.dex */
public class VideoCaptureParams {
    public boolean cameraRotationFix;
    public boolean enableCameraNonFatalErrRetry;
    public boolean enableFallback;
    public boolean enableMinCapFpsChange;
    public boolean enableOverrideCaptureResolution;
    public boolean fixCameraFatalErrNotClose;
    public int fps;
    public boolean frameScheduleOpt;
    public int height;
    public boolean incrementalParsing;
    public boolean isCameraOpenCloseSync;
    public boolean syncParamsFromBuilder;
    public boolean syncStopVECapture;
    public boolean useCamera2Api;
    public int width;

    public int getFps() {
        if (this.fps == -1) {
            this.fps = 30;
        }
        return this.fps;
    }

    public VideoCaptureParams() {
        this.width = 720;
        this.height = 1280;
        this.fps = -1;
        this.useCamera2Api = true;
        this.enableFallback = true;
        this.isCameraOpenCloseSync = true;
        this.enableOverrideCaptureResolution = true;
    }

    public boolean getCameraRotationFix() {
        return this.cameraRotationFix;
    }

    public boolean getEnableCameraNonFatalErrRetry() {
        return this.enableCameraNonFatalErrRetry;
    }

    public boolean getEnableFallback() {
        return this.enableFallback;
    }

    public boolean getEnableMinCapFpsChange() {
        return this.enableMinCapFpsChange;
    }

    public boolean getEnableOverrideCaptureResolution() {
        return this.enableOverrideCaptureResolution;
    }

    public boolean getFixCameraFatalErrNotClose() {
        return this.fixCameraFatalErrNotClose;
    }

    public boolean getFrameScheduleOpt() {
        return this.frameScheduleOpt;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean getIsCameraOpenCloseSync() {
        return this.isCameraOpenCloseSync;
    }

    public boolean getSyncParamsFromBuilder() {
        return this.syncParamsFromBuilder;
    }

    public boolean getSyncStopVECapture() {
        return this.syncStopVECapture;
    }

    public boolean getUseCamera2Api() {
        return this.useCamera2Api;
    }

    public int getWidth() {
        return this.width;
    }

    public void setFps(int i) {
        if (this.fps == -1 || !this.incrementalParsing) {
            this.fps = i;
        }
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setIncrementalParsing(boolean z) {
        this.incrementalParsing = z;
    }

    public void setUseCamera2Api(boolean z) {
        this.useCamera2Api = z;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public VideoCaptureParams(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.width = i;
        this.height = i2;
        this.fps = i3;
        this.useCamera2Api = z;
        this.enableMinCapFpsChange = z2;
        this.syncParamsFromBuilder = z3;
        this.enableFallback = z4;
        this.isCameraOpenCloseSync = z5;
        this.fixCameraFatalErrNotClose = z6;
        this.enableCameraNonFatalErrRetry = z7;
        this.syncStopVECapture = z8;
        this.cameraRotationFix = z9;
        this.enableOverrideCaptureResolution = z10;
        this.frameScheduleOpt = z11;
    }
}
