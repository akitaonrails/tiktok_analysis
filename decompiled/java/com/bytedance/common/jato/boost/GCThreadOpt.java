package com.bytedance.common.jato.boost;

import X.C2104908Ml;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes27.dex */
public class GCThreadOpt {
    public static volatile GCThreadOpt LIZIZ;
    public boolean LIZ;

    public static native int nIncreaseGCThreadPrio(int i, int i2, boolean z);

    public static native void nSetGCThreadPriorityWhenBlockGC(int i, int i2);

    public static GCThreadOpt LIZ() {
        if (LIZIZ == null) {
            synchronized (GCThreadOpt.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new GCThreadOpt();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    static {
        C2104908Ml.LIZIZ();
        LIZIZ = null;
    }
}
