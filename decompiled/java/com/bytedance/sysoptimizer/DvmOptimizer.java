package com.bytedance.sysoptimizer;

import android.content.Context;

/* JADX INFO: loaded from: classes34.dex */
public class DvmOptimizer {
    public static boolean sOptimized;

    public static boolean loadOptimizerOnNeed(Context context) {
        return false;
    }

    public static native void optLinearAllocBuffer(int i);

    public static native void startHookDvmFunc();

    public static void hookDvmLinearAllocFunc(Context context) {
        if (loadOptimizerOnNeed(context)) {
            startHookDvmFunc();
        }
    }

    public static void optDvmLinearAllocBuffer(Context context) {
        optDvmLinearAllocBuffer(context, 67108864);
    }

    public static synchronized void optDvmLinearAllocBuffer(Context context, int i) {
        if (sOptimized) {
            return;
        }
        if (loadOptimizerOnNeed(context)) {
            optLinearAllocBuffer(i);
            sOptimized = true;
        }
    }
}
