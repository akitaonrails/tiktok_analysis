package com.optimize.statistics;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public class StatLogUtils {
    public static boolean sIsDebug;

    public static void e(String str) {
    }

    public static native void setsIsDebugNative(boolean z);

    public static boolean IsDebug() {
        return sIsDebug;
    }

    public static void setsIsDebug(boolean z) {
        sIsDebug = z;
        try {
            setsIsDebugNative(z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
