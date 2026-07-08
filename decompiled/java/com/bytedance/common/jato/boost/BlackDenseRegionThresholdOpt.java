package com.bytedance.common.jato.boost;

import X.C2104908Ml;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class BlackDenseRegionThresholdOpt {
    public static native void nResetBlackDenseRegionThreshold();

    public static native int nSetBlackDenseRegionThreshold(int i, int i2);

    public static void LIZ() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            nResetBlackDenseRegionThreshold();
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

    public static int LIZIZ(int i) {
        int iNSetBlackDenseRegionThreshold = -1;
        if (Build.VERSION.SDK_INT < 26) {
            return -1;
        }
        try {
            iNSetBlackDenseRegionThreshold = nSetBlackDenseRegionThreshold(i, 2);
            return iNSetBlackDenseRegionThreshold;
        } catch (NoSuchMethodError e) {
            TryCatchGuardChecker.doCheck(e);
            e.printStackTrace();
            return iNSetBlackDenseRegionThreshold;
        } catch (UnsatisfiedLinkError e2) {
            TryCatchGuardChecker.doCheck(e2);
            e2.printStackTrace();
            return iNSetBlackDenseRegionThreshold;
        }
    }
}
