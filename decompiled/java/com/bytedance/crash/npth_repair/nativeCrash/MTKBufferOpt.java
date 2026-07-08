package com.bytedance.crash.npth_repair.nativeCrash;

import com.bytedance.crash.npth_repair.NpthRepair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class MTKBufferOpt {
    public static boolean LIZ;
    public static int LIZIZ;

    public static native int nOptMTKBuffer(int i);

    public static synchronized int LIZ(int i) {
        if (NpthRepair.LIZJ == 0) {
            if (LIZ) {
                return -2;
            }
            LIZ = true;
            try {
                LIZIZ = nOptMTKBuffer(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LIZIZ = -4;
            }
            return LIZIZ;
        }
        return -1;
    }
}
