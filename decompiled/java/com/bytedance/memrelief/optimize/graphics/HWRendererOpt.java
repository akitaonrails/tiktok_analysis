package com.bytedance.memrelief.optimize.graphics;

import X.C08PC;
import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class HWRendererOpt {
    public static boolean sOptimized;

    public static native boolean native_optimize(int i, int i2, boolean z);

    public static boolean isTargetOSVersion() {
        int i = Build.VERSION.SDK_INT;
        if (i == 24) {
            if ("samsung".equalsIgnoreCase(Build.MODEL)) {
                return false;
            }
        } else if (i > 34) {
            return false;
        }
        return true;
    }

    public static synchronized void optimize(Context context, int i, boolean z) {
        if (!isTargetOSVersion()) {
            return;
        }
        if (sOptimized) {
            return;
        }
        if (i < 20) {
            return;
        }
        try {
            C08PC.LIZ();
            sOptimized = native_optimize(Build.VERSION.SDK_INT, i, z);
        } catch (NoSuchMethodError e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (UnsatisfiedLinkError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
