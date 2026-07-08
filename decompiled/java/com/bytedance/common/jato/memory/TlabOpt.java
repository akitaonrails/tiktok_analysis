package com.bytedance.common.jato.memory;

import X.C2104908Ml;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class TlabOpt {
    public static WeakReference<Object> sGcWatcher;

    public static native void nativeDisableExpandTlab();

    public static native void nativeExpandTlab(String[] strArr, int[] iArr, int i);

    public static void LIZ(int i, String[] strArr, int[] iArr) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        if ((i == 0 && (strArr == null || iArr == null || strArr.length == 0 || iArr.length == 0)) || !C2104908Ml.LIZIZ()) {
            return;
        }
        try {
            nativeExpandTlab(strArr, iArr, i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
