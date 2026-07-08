package com.ss.bytertc.base.media;

import android.content.Context;

/* JADX INFO: loaded from: classes21.dex */
public interface VideoCapturer {
    void changeCaptureFormat(int i, int i2, int i3);

    void dispose();

    int enableFollowGravity(boolean z);

    int getDeviceOrientation();

    void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver);

    boolean isScreencast();

    void startCapture(int i, int i2, int i3);

    void startCapture(int i, int i2, int i3, int i4);

    void stopCapture();

    void turnOffFlashLight();

    void turnOnFlashLight();
}
