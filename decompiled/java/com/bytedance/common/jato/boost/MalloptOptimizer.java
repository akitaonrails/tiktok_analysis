package com.bytedance.common.jato.boost;

import X.C2104908Ml;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class MalloptOptimizer {
    public static native boolean nMalloptOptimize(int i);

    public static native int nMalloptTuning(int i, int i2);

    public static void LIZ() {
        if (C2104908Ml.LIZIZ()) {
            ByteHook.init();
            try {
                nMalloptTuning(-101, 0);
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    static {
        C2104908Ml.LIZIZ();
    }
}
