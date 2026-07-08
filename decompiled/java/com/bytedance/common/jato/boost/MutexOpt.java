package com.bytedance.common.jato.boost;

import X.C2104908Ml;
import android.os.Build;
import android.os.Process;

/* JADX INFO: loaded from: classes27.dex */
public class MutexOpt {
    public static native void exclusiveLockSpinOptInternal(int i);

    public static void LIZ(int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 || i2 > 34 || !Process.is64Bit()) {
            return;
        }
        C2104908Ml.LIZIZ();
        exclusiveLockSpinOptInternal(i);
    }
}
