package com.bytedance.common.jato.boost;

import X.C2104908Ml;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes27.dex */
public class SoftReferenceLruOpt {
    public static boolean LIZ;

    public static native int nEnable(long j, int i);

    public static native int nEnableV2(long j, int i);

    public static synchronized void LIZ(int i, long j) {
        if (LIZ) {
            return;
        }
        if (C2104908Ml.LIZIZ()) {
            try {
                if (nEnable(j, i) == 1) {
                    LIZ = true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static synchronized void LIZIZ(int i, long j) {
        if (LIZ) {
            return;
        }
        if (C2104908Ml.LIZIZ()) {
            try {
                if (nEnableV2(j, i) == 1) {
                    LIZ = true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
