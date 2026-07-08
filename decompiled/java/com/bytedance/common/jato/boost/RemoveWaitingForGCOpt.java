package com.bytedance.common.jato.boost;

import X.C2104908Ml;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class RemoveWaitingForGCOpt {
    public static volatile boolean LIZ;

    public static native boolean nEnable(boolean z);

    public static void LIZ(boolean z) {
        int i;
        if (!LIZ && (i = Build.VERSION.SDK_INT) >= 29 && i <= 34) {
            C2104908Ml.LIZIZ();
            try {
                LIZ = true;
                nEnable(z);
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
