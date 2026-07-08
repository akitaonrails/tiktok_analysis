package com.bytedance.sdui.render.tasm.base;

import android.os.Trace;

/* JADX INFO: loaded from: classes21.dex */
public class TraceEvent {
    public static native void nativeBeginSection(long j, String str);

    public static native boolean nativeCategoryEnabled(long j);

    public static native void nativeEndSection(long j, String str);

    public static native void nativeInstant(long j, String str, long j2, String str2);

    public static native boolean nativeRegisterTraceBackend(long j);

    public static void LIZ(String str) {
        System.nanoTime();
        Trace.beginSection(str);
        Trace.endSection();
    }
}
