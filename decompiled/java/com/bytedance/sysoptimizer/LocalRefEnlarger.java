package com.bytedance.sysoptimizer;

import X.C08PL;
import X.C2112108Pf;
import android.content.Context;
import android.os.Build;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class LocalRefEnlarger {
    public static boolean sOptimized;

    public static native boolean optimize(int i);

    public static native void test();

    public static synchronized void fix(Context context) {
        if (sOptimized) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 26) {
            return;
        }
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                C2112108Pf c2112108Pf = new C2112108Pf();
                c2112108Pf.LIZ = C08PL.SHARED.value;
                c2112108Pf.LIZIZ = true;
                ShadowHook.init(c2112108Pf.LIZ());
                optimize(i);
                sOptimized = true;
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
