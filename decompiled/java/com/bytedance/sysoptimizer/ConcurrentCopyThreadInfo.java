package com.bytedance.sysoptimizer;

import X.C08PL;
import X.C2112108Pf;
import android.content.Context;
import android.os.Build;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class ConcurrentCopyThreadInfo {
    public static boolean sOptimized;

    public static native boolean nStart(boolean z, boolean z2);

    public static synchronized void start(Context context, boolean z, boolean z2) {
        if (sOptimized) {
            return;
        }
        if (Build.VERSION.SDK_INT == 30 && SysOptimizer.loadOptimizerLibrary(context)) {
            C2112108Pf c2112108Pf = new C2112108Pf();
            c2112108Pf.LIZ = C08PL.SHARED.value;
            c2112108Pf.LIZIZ = true;
            ShadowHook.init(c2112108Pf.LIZ());
            try {
                nStart(z, z2);
                sOptimized = true;
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
