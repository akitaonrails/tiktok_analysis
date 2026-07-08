package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class VMDebugDumpHprofOptimizer {
    public static boolean sOptimized;

    public static native boolean optimize();

    public static synchronized void fix(Context context) {
        if (sOptimized) {
            return;
        }
        if (Build.VERSION.SDK_INT == 23 && SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                optimize();
                sOptimized = true;
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
