package com.bytedance.common.jato.boost;

import X.C2104908Ml;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class HiddenApiOpt {
    public static native boolean nOptimize();

    public static void LIZ() {
        if (Build.VERSION.SDK_INT <= 30) {
            return;
        }
        C2104908Ml.LIZIZ();
        try {
            nOptimize();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
