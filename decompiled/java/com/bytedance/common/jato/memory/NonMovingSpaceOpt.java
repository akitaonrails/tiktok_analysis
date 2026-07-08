package com.bytedance.common.jato.memory;

import X.C2104908Ml;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes34.dex */
public class NonMovingSpaceOpt {
    public static native boolean optimizeNonMovingSpace(int i, int i2);

    public static native void printHeapStatus();

    public static void LIZ(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 26 && C2104908Ml.LIZIZ() && i >= 0 && i2 >= 0) {
            try {
                optimizeNonMovingSpace(i * 1024 * 1024, i2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
