package com.bytedance.common.jato.boost;

import X.C2104908Ml;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class ThrowableUnwindOpt {
    public static native boolean optimizeFileExistUnwind();

    public static void LIZ() {
        if (Build.VERSION.SDK_INT <= 28) {
            return;
        }
        C2104908Ml.LIZIZ();
        try {
            optimizeFileExistUnwind();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
