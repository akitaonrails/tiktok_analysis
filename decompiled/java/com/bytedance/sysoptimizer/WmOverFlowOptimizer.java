package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class WmOverFlowOptimizer {
    public static boolean mOptimized;

    public static native boolean optimize();

    public static synchronized void fix(Context context) {
        if (mOptimized) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 23 && i <= 25) {
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    optimize();
                    mOptimized = true;
                } catch (NoSuchMethodError e) {
                    TryCatchGuardChecker.doCheck(e);
                } catch (UnsatisfiedLinkError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
    }
}
