package com.bytedance.otis.memory;

/* JADX INFO: loaded from: classes5.dex */
public final class OtisMemoryOpt {
    public static final native String readString();

    public static final native boolean writeString(String str);

    static {
        new OtisMemoryOpt();
        EnsureLoad.init();
    }
}
