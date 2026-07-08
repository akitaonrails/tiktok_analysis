package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class VdexDupLoadOptimizer {
    public static boolean sOptimized;

    public static native boolean native_optimize();

    public static boolean isTargetOSVersion() {
        int i = Build.VERSION.SDK_INT;
        return i >= 28 && i <= 30;
    }

    public static synchronized void optimize(Context context) {
        if (sOptimized) {
            return;
        }
        if (!isTargetOSVersion()) {
            return;
        }
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                sOptimized = native_optimize();
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
