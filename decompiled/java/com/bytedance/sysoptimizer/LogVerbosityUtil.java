package com.bytedance.sysoptimizer;

/* JADX INFO: loaded from: classes4.dex */
public class LogVerbosityUtil {
    public static native void nOpen();

    public static void open() {
        if (SysOptimizer.loadOptimizerLibrary(null)) {
            nOpen();
        }
    }
}
