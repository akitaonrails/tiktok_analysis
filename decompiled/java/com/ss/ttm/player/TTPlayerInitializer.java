package com.ss.ttm.player;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public class TTPlayerInitializer {
    public static native void _init();

    public static final synchronized void LIZ() {
        if (enableInitializer() == 0) {
            return;
        }
        try {
            _init();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static int enableInitializer() {
        return x.LIZJ(70, 0);
    }
}
