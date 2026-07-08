package com.bytedance.otis.optimise.system.jit;

import X.C2105508Mr;
import X.C2112108Pf;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class JitMemory {
    public static int sInit;

    public static boolean isVersionCompat() {
        return true;
    }

    public static native void nativeBlockTrimMaps(int i);

    public static native void nativeUnBlockTrimMaps();

    static {
        try {
            if (C2105508Mr.LIZ() && ShadowHook.init(new C2112108Pf().LIZ()) == 0) {
                sInit = 1;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            sInit = -1;
        }
    }

    public static void disableBlockTrimMaps() {
        if (isVersionCompat() && sInit == 2) {
            nativeUnBlockTrimMaps();
            sInit = 1;
        }
    }

    public static void blockTrimMaps(int i) {
        if (isVersionCompat() && sInit > 0 && i > 0) {
            sInit = 2;
            nativeBlockTrimMaps(i);
        }
    }
}
