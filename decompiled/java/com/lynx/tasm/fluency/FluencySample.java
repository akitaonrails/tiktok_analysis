package com.lynx.tasm.fluency;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes21.dex */
public class FluencySample {
    public static final AtomicBoolean LIZ = new AtomicBoolean(true);
    public static boolean LIZIZ = false;

    public static native void nativeNeedCheckFluencyEnable();

    public static native void nativeSetFluencySample(boolean z);

    public static void LIZ() {
        LIZ.set(true);
        nativeNeedCheckFluencyEnable();
    }
}
