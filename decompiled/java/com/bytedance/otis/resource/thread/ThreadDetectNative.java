package com.bytedance.otis.resource.thread;

import com.bytedance.otis.resource.util.EnsureLoad;

/* JADX INFO: loaded from: classes4.dex */
public final class ThreadDetectNative {
    public static final native void close();

    public static final native void config(boolean z, boolean z2);

    public static final native void dump();

    public static final native void open();

    static {
        new ThreadDetectNative();
        EnsureLoad.LIZ.init();
    }
}
