package com.ss.lyrax.utils.loader;

/* JADX INFO: loaded from: classes4.dex */
public class LyraxNativeLibraryLoaderAdapter {
    public static LyraxNativeLibraryLoader mLyraxNativeLibraryLoader = new LyraxNativeLibraryLoaderImpl();

    public static LyraxNativeLibraryLoader getLyraxNativeLibraryLoader() {
        return mLyraxNativeLibraryLoader;
    }

    public static void setLyraxNativeLibraryLoader(LyraxNativeLibraryLoader lyraxNativeLibraryLoader) {
        mLyraxNativeLibraryLoader = lyraxNativeLibraryLoader;
    }
}
