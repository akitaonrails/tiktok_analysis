package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class OppoAndroidSOptimizer {
    public static boolean sOptimized;

    public static native void optimizeConfigOplusVppType();

    public static native void optimizeInitAudioSchedBoost();

    public static synchronized void fix(Context context, boolean z, boolean z2) {
        if (!z && !z2) {
            return;
        }
        if (sOptimized) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i != 31 && i != 32) {
            return;
        }
        String lowerCase = Build.BRAND.toLowerCase(Locale.ROOT);
        if (!lowerCase.contains("oppo") && !lowerCase.contains("realme")) {
            return;
        }
        if (!Process.is64Bit()) {
            return;
        }
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            if (z) {
                try {
                    optimizeInitAudioSchedBoost();
                } catch (NoSuchMethodError e) {
                    TryCatchGuardChecker.doCheck(e);
                } catch (UnsatisfiedLinkError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            if (z2) {
                optimizeConfigOplusVppType();
            }
            sOptimized = true;
        }
    }
}
