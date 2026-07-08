package com.bytedance.common.jato.interpreter;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class InterpreterBridge {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;

    public static native int initInterpreterBridgeInternal(int i);

    public static void LIZ() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 33 && i >= 24 && !LIZ && !LIZIZ) {
            try {
                if (initInterpreterBridgeInternal(i) != 0) {
                    LIZIZ = true;
                }
                LIZ = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
