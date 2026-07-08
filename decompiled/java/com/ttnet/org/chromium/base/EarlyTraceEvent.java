package com.ttnet.org.chromium.base;

import X.C09NF;
import X.C1499310p7R;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes24.dex */
public class EarlyTraceEvent {
    public static volatile int LIZ = 0;
    public static final Object LIZIZ = new Object();

    public static boolean getBackgroundStartupTracingFlag() {
        return false;
    }

    public static boolean LIZIZ() {
        return LIZ == 1;
    }

    public static void setBackgroundStartupTracingFlag(boolean z) {
        C09NF.LIZ.edit().putBoolean("bg_startup_tracing", z).apply();
    }

    public static void LIZ(String str, boolean z) {
        if (!LIZIZ()) {
            return;
        }
        new C1499310p7R(str, true, z);
        synchronized (LIZIZ) {
            try {
                if (LIZIZ()) {
                    throw null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZJ(String str, boolean z) {
        if (!LIZIZ()) {
            return;
        }
        new C1499310p7R(str, false, z);
        synchronized (LIZIZ) {
            try {
                if (LIZIZ()) {
                    throw null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
