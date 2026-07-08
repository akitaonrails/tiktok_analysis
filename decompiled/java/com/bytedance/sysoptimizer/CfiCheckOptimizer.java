package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class CfiCheckOptimizer {
    public static boolean mOptimized;

    public static native boolean disableCfiCheck();

    public static boolean loadOptimizerOnNeed(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i <= 30 && Process.is64Bit()) {
            return SysOptimizer.loadOptimizerLibrary(context);
        }
        return false;
    }

    public static synchronized boolean optimize(Context context) {
        if (mOptimized) {
            return true;
        }
        if (loadOptimizerOnNeed(context)) {
            try {
                boolean zDisableCfiCheck = disableCfiCheck();
                mOptimized = zDisableCfiCheck;
                return zDisableCfiCheck;
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }
}
