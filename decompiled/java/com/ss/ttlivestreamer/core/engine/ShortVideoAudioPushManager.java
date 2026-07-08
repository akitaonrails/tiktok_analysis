package com.ss.ttlivestreamer.core.engine;

import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* JADX INFO: loaded from: classes21.dex */
public class ShortVideoAudioPushManager extends NativeObject {
    public static ShortVideoAudioPushManager mSingleInstance;

    private native void nativeCreate();

    private native long nativeGetPlayerWrapper(AudioDeviceModule.AudioRenderSink audioRenderSink, int i, int i2, boolean z);

    private native boolean nativeGetReportStats(AudioDeviceModule.AudioRenderSink audioRenderSink, long j, TEBundle tEBundle);

    private native void nativePause();

    private native void nativeResume();

    public static void dispose() {
        ShortVideoAudioPushManager shortVideoAudioPushManager = mSingleInstance;
        if (shortVideoAudioPushManager != null) {
            shortVideoAudioPushManager.release();
            mSingleInstance = null;
        }
    }

    public static void pause() {
        ShortVideoAudioPushManager shortVideoAudioPushManager = mSingleInstance;
        if (shortVideoAudioPushManager != null) {
            shortVideoAudioPushManager.nativePause();
        }
    }

    public static void resume() {
        ShortVideoAudioPushManager shortVideoAudioPushManager = mSingleInstance;
        if (shortVideoAudioPushManager != null) {
            shortVideoAudioPushManager.nativeResume();
        }
    }

    public ShortVideoAudioPushManager() {
        nativeCreate();
    }

    public static long getAudioLongAddress(AudioDeviceModule.AudioRenderSink audioRenderSink, int i, int i2) {
        return getAudioLongAddress(audioRenderSink, i, i2, false);
    }

    public static boolean getReportStats(AudioDeviceModule.AudioRenderSink audioRenderSink, long j, TEBundle tEBundle) {
        ShortVideoAudioPushManager shortVideoAudioPushManager = mSingleInstance;
        if (shortVideoAudioPushManager != null) {
            return shortVideoAudioPushManager.nativeGetReportStats(audioRenderSink, j, tEBundle);
        }
        return false;
    }

    public static long getAudioLongAddress(AudioDeviceModule.AudioRenderSink audioRenderSink, int i, int i2, boolean z) {
        if (mSingleInstance == null) {
            mSingleInstance = new ShortVideoAudioPushManager();
        }
        return mSingleInstance.nativeGetPlayerWrapper(audioRenderSink, i, i2, z);
    }
}
