package com.bytedance.common.jato.boost;

import X.C2104908Ml;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class PosionDeadObjectOpt {
    public static volatile boolean LIZ;

    public static native int nBypassPoisonDeadObjects();

    public static void LIZ() {
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i > 33 || LIZ) {
            return;
        }
        try {
            nBypassPoisonDeadObjects();
            LIZ = true;
        } catch (NoSuchMethodError e) {
            TryCatchGuardChecker.doCheck(e);
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            TryCatchGuardChecker.doCheck(e2);
            e2.printStackTrace();
        }
    }

    static {
        C2104908Ml.LIZIZ();
    }
}
