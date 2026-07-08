package com.bytedance.common.jato.classlinker;

import X.C2104908Ml;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class AnnotationResolvingOpt {
    public static volatile boolean LIZ;

    public static native boolean nativeOptimize();

    public static void LIZ() {
        int i;
        if (!LIZ && (i = Build.VERSION.SDK_INT) >= 33 && i <= 34) {
            C2104908Ml.LIZIZ();
            try {
                LIZ = true;
                nativeOptimize();
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
