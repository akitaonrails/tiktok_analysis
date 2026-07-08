package com.bytedance.sysoptimizer;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class EnlargePoolOpt {
    public static boolean sOptimized;

    public static native boolean optimize(int i);

    public static synchronized void fix(Context context, int i) {
        if (sOptimized) {
            return;
        }
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                try {
                    optimize(i);
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
