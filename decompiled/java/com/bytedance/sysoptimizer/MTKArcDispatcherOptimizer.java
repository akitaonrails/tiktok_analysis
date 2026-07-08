package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class MTKArcDispatcherOptimizer {
    public static boolean sOptimized;

    public static native void banMTKArcDispatcher();

    public static void fix(Context context) {
        if (Build.VERSION.SDK_INT == 28 && !sOptimized && Build.BRAND.toLowerCase(Locale.ROOT).contains("oppo") && Process.is64Bit() && SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                banMTKArcDispatcher();
                sOptimized = true;
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
