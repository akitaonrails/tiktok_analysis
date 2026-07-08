package com.ss.android.ttve.nativePort;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes36.dex */
public class TEAudioStreamVCUtils {
    public static native int nativeCancelStreamVCConnet(long j);

    public static native long nativeCreateStreamVCHandle(String str, String str2, String str3, String str4, OnTEAudioStreamVCDataReceivedListener onTEAudioStreamVCDataReceivedListener);

    public static native int nativeDestroyStreamVCHandle(long j);

    public static native long nativeIsStreamVCAudioPath(String str);

    public static native int nativeRestartStreamVCConnet(long j);

    public static native int nativeStartStreamVCConnet(long j, String str);

    public static native int nativeStartStreamVCProcess(long j, String str, String str2, long j2, long j3);

    public static native int nativeStopStreamVCConnet(long j, boolean z);

    static {
        TENativeLibsLoader.loadLibrary();
    }

    public static int cancelStreamVCConnet(long j) {
        if (j == -1) {
            return -1;
        }
        return nativeCancelStreamVCConnet(j);
    }

    public static int destroyStreamVCHandle(long j) {
        if (j == -1) {
            return -1;
        }
        return nativeDestroyStreamVCHandle(j);
    }

    public static long isStreamVCAudioPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        return nativeIsStreamVCAudioPath(str);
    }

    public static int restartStreamVCConnet(long j) {
        if (j == -1) {
            return -1;
        }
        return restartStreamVCConnet(j);
    }

    public static int startStreamVCConnet(long j, String str) {
        if (j != -1 && !TextUtils.isEmpty(str)) {
            return nativeStartStreamVCConnet(j, str);
        }
        return -1;
    }

    public static int stopStreamVCConnet(long j, boolean z) {
        if (j == -1) {
            return -1;
        }
        return nativeStopStreamVCConnet(j, z);
    }

    public static long createStreamVCHandle(String str, String str2, String str3, String str4, OnTEAudioStreamVCDataReceivedListener onTEAudioStreamVCDataReceivedListener) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            return nativeCreateStreamVCHandle(str, str2, str3, str4, onTEAudioStreamVCDataReceivedListener);
        }
        return -1L;
    }

    public static int startStreamVCProcess(long j, String str, String str2, long j2, long j3) {
        if (j == -1) {
            return -1;
        }
        return nativeStartStreamVCProcess(j, str, str2, j2, j3);
    }
}
