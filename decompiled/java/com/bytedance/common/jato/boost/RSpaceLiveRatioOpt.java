package com.bytedance.common.jato.boost;

import X.C2104908Ml;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class RSpaceLiveRatioOpt {
    public static native int nRegionSpaceLiveRatioOpt(int i, int i2);

    public static native void nResetRegionSpaceLiveRatioOpt();

    public static void LIZIZ() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            nResetRegionSpaceLiveRatioOpt();
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

    public static void LIZ(int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            nRegionSpaceLiveRatioOpt(i, 2);
        } catch (NoSuchMethodError e) {
            TryCatchGuardChecker.doCheck(e);
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            TryCatchGuardChecker.doCheck(e2);
            e2.printStackTrace();
        }
    }
}
