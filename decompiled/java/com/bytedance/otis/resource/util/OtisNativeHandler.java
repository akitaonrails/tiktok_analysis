package com.bytedance.otis.resource.util;

/* JADX INFO: loaded from: classes4.dex */
public final class OtisNativeHandler {
    public static final OtisNativeHandler LIZ = new OtisNativeHandler();

    public static final void getStack() {
    }

    public final native void setDebugger(boolean z);

    static {
        EnsureLoad.LIZ.init();
    }
}
