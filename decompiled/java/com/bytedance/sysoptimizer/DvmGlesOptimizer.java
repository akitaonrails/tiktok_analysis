package com.bytedance.sysoptimizer;

import android.content.Context;

/* JADX INFO: loaded from: classes34.dex */
public class DvmGlesOptimizer {
    public static boolean mOptimized;

    public static native boolean optimize();

    public static synchronized void fix(Context context) {
        if (mOptimized) {
        }
    }
}
