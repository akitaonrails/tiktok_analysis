package com.bytedance.common.jato.boost;

import X.C2104908Ml;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class DecodeJObjectOpt {
    public static native boolean nOptimizeDecodeJObject();

    public static void LIZ() {
        if (Build.VERSION.SDK_INT <= 30) {
            C2104908Ml.LIZIZ();
            try {
                nOptimizeDecodeJObject();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
