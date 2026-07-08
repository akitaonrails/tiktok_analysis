package com.bytedance.common.jato.boost;

import X.C2104908Ml;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class HandleGetEnvOpt {
    public static native void nativeInit();

    public static void init() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 || i > 34) {
            return;
        }
        try {
            nativeInit();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    static {
        C2104908Ml.LIZIZ();
    }
}
