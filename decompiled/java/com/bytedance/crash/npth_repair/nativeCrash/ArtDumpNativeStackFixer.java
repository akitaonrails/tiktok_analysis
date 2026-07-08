package com.bytedance.crash.npth_repair.nativeCrash;

import com.bytedance.crash.npth_repair.NpthRepair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class ArtDumpNativeStackFixer {
    public static boolean LIZ;
    public static int LIZIZ;

    public static native int nStartFixDumpNativeStack();

    public static native void nStopFixDumpNativeStack();

    public static synchronized int LIZ() {
        if (NpthRepair.LIZJ != 0) {
            return -1;
        }
        if (LIZ) {
            return -2;
        }
        LIZ = true;
        try {
            LIZIZ = nStartFixDumpNativeStack();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ = -4;
        }
        return LIZIZ;
    }
}
