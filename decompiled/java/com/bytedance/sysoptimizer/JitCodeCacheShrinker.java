package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class JitCodeCacheShrinker {
    public static String TAG = "OPTIMIZER-JitCodeCacheShrinker";
    public static boolean mOptimized;

    public static native boolean native_shrink(int i, int i2, int i3);

    public static boolean loadOptimizerOnNeed(Context context) {
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized void shrink(Context context, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29 && i3 <= 34) {
            if (mOptimized) {
                return;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    ByteHook.init();
                    mOptimized = native_shrink(i3, i, i2);
                } catch (UnsatisfiedLinkError e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }
}
