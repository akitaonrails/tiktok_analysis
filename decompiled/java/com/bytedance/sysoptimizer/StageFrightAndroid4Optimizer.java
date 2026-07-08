package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class StageFrightAndroid4Optimizer {
    public static boolean mOptimized;

    public static native boolean optimize();

    public static void fixStageFrightAndroid4(Context context) {
        if (!mOptimized && Build.VERSION.SDK_INT < 26 && SysOptimizer.loadOptimizerLibrary(context)) {
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
