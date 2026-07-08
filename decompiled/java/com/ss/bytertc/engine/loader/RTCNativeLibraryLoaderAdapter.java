package com.ss.bytertc.engine.loader;

/* JADX INFO: loaded from: classes21.dex */
public class RTCNativeLibraryLoaderAdapter {
    public static RTCNativeLibraryLoader mRtcNativeLibraryLoader = new RTCNativeLibraryLoaderImpl();

    public static RTCNativeLibraryLoader getRtcNativeLibraryLoader() {
        return mRtcNativeLibraryLoader;
    }

    public static void setRtcNativeLibraryLoader(RTCNativeLibraryLoader rTCNativeLibraryLoader) {
        mRtcNativeLibraryLoader = rTCNativeLibraryLoader;
    }
}
