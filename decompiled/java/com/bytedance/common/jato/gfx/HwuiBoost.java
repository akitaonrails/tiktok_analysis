package com.bytedance.common.jato.gfx;

import X.C0V4J;
import X.C2104908Ml;
import android.os.Build;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class HwuiBoost {
    public static boolean LIZ;

    public static native void nativeBoost(boolean z, boolean z2);

    public static void LIZ(boolean z, boolean z2, boolean z3) {
        synchronized (HwuiBoost.class) {
            try {
                if (LIZ) {
                    return;
                }
                LIZ = true;
                if (z && Build.VERSION.SDK_INT >= 29) {
                    GLESInitBoost.LIZ(false);
                }
                if (Build.VERSION.SDK_INT < 31) {
                    z3 = false;
                }
                if ((z2 || z3) && C2104908Ml.LIZIZ()) {
                    ByteHook.init(new C0V4J().LIZ());
                    nativeBoost(z2, z3);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
