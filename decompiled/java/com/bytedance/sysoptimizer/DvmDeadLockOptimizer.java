package com.bytedance.sysoptimizer;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class DvmDeadLockOptimizer {
    public static String TAG = "SYSOPTIMIZER";
    public static boolean mOptimized;

    public static boolean loadOptimizerOnNeed(Context context) {
        return false;
    }

    public static native boolean optimize();

    public static synchronized boolean optimize(Context context) {
        if (mOptimized) {
            return true;
        }
        if (loadOptimizerOnNeed(context)) {
            try {
                boolean zOptimize = optimize();
                mOptimized = zOptimize;
                return zOptimize;
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }
}
