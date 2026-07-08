package com.bytedance.sysoptimizer;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class JitGetMethodHashOptimizer {
    public static boolean mOptimized;

    public static native boolean optimize();

    public static void fix(Context context) {
        if (!mOptimized && SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                optimize();
                mOptimized = true;
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static boolean loadOptimizerOnNeed(Context context) {
        return SysOptimizer.loadOptimizerLibrary(context);
    }
}
