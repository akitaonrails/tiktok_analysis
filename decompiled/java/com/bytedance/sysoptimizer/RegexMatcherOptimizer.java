package com.bytedance.sysoptimizer;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class RegexMatcherOptimizer {
    public static boolean sOptimized;

    public static native boolean optimize();

    public static synchronized void fix(Context context) {
        if (sOptimized) {
        }
    }
}
