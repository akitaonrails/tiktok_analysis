package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class HighLevelTrimMemory {
    public static String TAG = "SYSOPTIMIZER";
    public static boolean mOptimized;

    public static native boolean disable();

    public static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT > 29) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean optimize(Context context) {
        if (mOptimized) {
            return true;
        }
        if (loadOptimizerOnNeed(context)) {
            try {
                boolean zDisable = disable();
                mOptimized = zDisable;
                return zDisable;
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }
}
