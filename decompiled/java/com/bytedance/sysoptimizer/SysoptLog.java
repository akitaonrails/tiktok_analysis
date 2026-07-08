package com.bytedance.sysoptimizer;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class SysoptLog {
    public static boolean sOptimized;

    public static native void logOpen();

    public static synchronized void enbale(Context context) {
        if (sOptimized) {
            return;
        }
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                try {
                    logOpen();
                    sOptimized = true;
                } catch (NoSuchMethodError e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
