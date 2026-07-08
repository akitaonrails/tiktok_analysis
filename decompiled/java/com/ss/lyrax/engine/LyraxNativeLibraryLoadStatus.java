package com.ss.lyrax.engine;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LyraxNativeLibraryLoadStatus {
    LOADED_SUCCESS(0),
    LOADED_ERROR(1),
    ALREADY_LOADED(2);

    public final int val;

    public static LyraxNativeLibraryLoadStatus valueOf(String str) {
        return (LyraxNativeLibraryLoadStatus) C08FF.LIZ(LyraxNativeLibraryLoadStatus.class, str);
    }

    LyraxNativeLibraryLoadStatus(int i) {
        this.val = i;
    }
}
