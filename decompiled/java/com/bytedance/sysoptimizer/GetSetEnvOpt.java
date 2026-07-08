package com.bytedance.sysoptimizer;

import android.content.Context;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class GetSetEnvOpt {
    public static boolean sOptimized;

    public static native void fixGetSetEnvCall();

    public static synchronized void fix(Context context) {
        if (sOptimized) {
            return;
        }
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                try {
                    fixGetSetEnvCall();
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
