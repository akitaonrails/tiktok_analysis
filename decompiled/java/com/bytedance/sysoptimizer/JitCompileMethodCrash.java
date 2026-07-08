package com.bytedance.sysoptimizer;

import X.C08PL;
import X.C2112108Pf;
import android.content.Context;
import android.os.Build;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class JitCompileMethodCrash {
    public static String TAG = "OPTIMIZER-JIT";
    public static boolean mOptimized;

    public static native boolean optimize(int i);

    public static boolean loadOptimizerOnNeed(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 27 && i <= 32) {
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
                C2112108Pf c2112108Pf = new C2112108Pf();
                c2112108Pf.LIZ = C08PL.SHARED.value;
                c2112108Pf.LIZIZ = true;
                ShadowHook.init(c2112108Pf.LIZ());
                boolean zOptimize = optimize(Build.VERSION.SDK_INT);
                mOptimized = zOptimize;
                return zOptimize;
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }
}
