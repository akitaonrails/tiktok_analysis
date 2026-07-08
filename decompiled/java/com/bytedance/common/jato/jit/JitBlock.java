package com.bytedance.common.jato.jit;

import X.C07TK;
import X.C2104908Ml;
import X.C2188811AlT;
import android.os.Build;
import com.bytedance.common.jato.util.DeviceInfoUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes27.dex */
public class JitBlock {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static C07TK LIZLLL;

    public static native int initJitBlockInternal(int i, boolean z);

    public static native void lightJitBlockStartInternal();

    public static native void lightJitBlockStopInternal();

    public static native void nativeSetInterval(long j);

    public static native void nativeSetPriority(int i);

    public static boolean LIZ() {
        return LIZ && !LIZJ && Build.VERSION.SDK_INT >= 25 && DeviceInfoUtils.LIZ() <= 35;
    }

    public static void lightJitBlockStart() {
        if (LIZ()) {
            lightJitBlockStartInternal();
        }
    }

    public static void lightJitBlockStop() {
        if (LIZ()) {
            lightJitBlockStopInternal();
        }
    }

    public static void LIZIZ(boolean z) {
        int iLIZ;
        if (!LIZIZ || LIZ || LIZJ || Build.VERSION.SDK_INT < 25 || (iLIZ = DeviceInfoUtils.LIZ()) > 35 || !C2104908Ml.LIZIZ()) {
            return;
        }
        try {
            int iInitJitBlockInternal = initJitBlockInternal(iLIZ, z);
            if (iInitJitBlockInternal != 0) {
                C07TK c07tk = LIZLLL;
                if (c07tk != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("init jit block failed:");
                    sbLIZ.append(iInitJitBlockInternal);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c07tk.LIZ();
                }
                LIZJ = true;
            }
            LIZ = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZJ(long j) {
        if (LIZ()) {
            nativeSetInterval(j);
        }
    }

    public static void LIZLLL(int i) {
        if (LIZ() && i != -1) {
            nativeSetPriority(i);
        }
    }
}
