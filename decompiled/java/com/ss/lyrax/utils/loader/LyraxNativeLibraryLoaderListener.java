package com.ss.lyrax.utils.loader;

/* JADX INFO: loaded from: classes19.dex */
public interface LyraxNativeLibraryLoaderListener {
    void onLoadAlready(String str);

    void onLoadError(String str);

    void onLoadSuccess(String str);
}
