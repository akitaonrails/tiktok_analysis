package com.ss.lyrax.video;

import android.graphics.Bitmap;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.video.bridge.AbsBmfBridgeCallback;
import com.ss.lyrax.video.bridge.AbsEffectBridgeCallback;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxVideoPlatformWrapper {
    void applyErrorStrategy();

    void applyPauseStrategy(boolean z);

    void clearAuxStream(int i);

    void enablePushAliveCheck(boolean z);

    AbsBmfBridgeCallback getBmfBridgeCallback();

    LyraxVideoContentType getContentType();

    AbsEffectBridgeCallback getEffectBridgeCallback();

    LyraxVideoSourceType getSourceType();

    LyraxVideoSourceState getState();

    LyraxPreProcessVideoNodeStats getStats();

    LyraxErrorCode initPlatformWrapper(LyraxVideoPlatformWrapperConfig lyraxVideoPlatformWrapperConfig, LyraxVideoPlatformCaptureConfig lyraxVideoPlatformCaptureConfig);

    void onVideoCaptureFirstFrameRendered(int i, int i2, long j);

    void onVideoCaptureFrameResolutionChanged(int i, int i2, long j);

    LyraxErrorCode pushAuxFrame(int i, LyraxVideoFrame lyraxVideoFrame, long j);

    LyraxErrorCode pushStaticImageBitmap(Bitmap bitmap, int i);

    LyraxErrorCode pushVideoFrame(LyraxVideoFrame lyraxVideoFrame);

    void setErrorStrategy(ErrorStrategy errorStrategy);

    void setPauseStrategy(PauseStrategy pauseStrategy);

    void setPushTimeoutThreshold(int i);

    LyraxErrorCode startPlatformCapture();

    LyraxErrorCode stopPlatformCapture();

    LyraxErrorCode switchCameraBack();

    LyraxErrorCode switchCameraFront();

    LyraxErrorCode switchCameraTo(String str);

    LyraxErrorCode switchSubSource(LyraxVideoSubSource lyraxVideoSubSource);

    LyraxErrorCode uninitPlatformWrapper();

    LyraxErrorCode updateExternalStats(LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats);

    LyraxErrorCode updatePlatformCaptureConfig(LyraxVideoPlatformCaptureConfig lyraxVideoPlatformCaptureConfig);
}
