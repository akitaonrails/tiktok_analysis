package com.bytedance.otis.resource.lock;

import com.bytedance.otis.resource.util.EnsureLoad;

/* JADX INFO: loaded from: classes4.dex */
public final class PriorityNative {
    public static final native void end();

    public static final native void start();

    static {
        new PriorityNative();
        EnsureLoad.LIZ.init();
    }
}
