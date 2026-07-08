package com.bytedance.sysoptimizer.allocatorx;

import X.C08PL;
import X.C2112108Pf;
import android.content.Context;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.sysoptimizer.SysOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class HeapGcRegulator {
    public static boolean sInited;

    public static native boolean optimize(long j, float f, float f2, float f3, float f4);

    public static synchronized void optimize(Context context, float f, float f2, float f3, float f4) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            C2112108Pf c2112108Pf = new C2112108Pf();
            c2112108Pf.LIZ = C08PL.SHARED.value;
            c2112108Pf.LIZIZ = true;
            ShadowHook.init(c2112108Pf.LIZ());
            try {
                try {
                    if (sInited) {
                        return;
                    }
                    if (optimize(Runtime.getRuntime().maxMemory(), f, f2, f3, f4)) {
                        sInited = true;
                    }
                } catch (NoSuchMethodError e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
