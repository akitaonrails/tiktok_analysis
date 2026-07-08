package com.ss.bytertc.engine.loader;

/* JADX INFO: loaded from: classes21.dex */
public interface RTCNativeLibraryLoaderListener {
    void onLoadAlready(String str);

    void onLoadError(String str);

    void onLoadSuccess(String str);
}
