package com.bytedance.sysoptimizer;

import X.C08PL;
import X.C2112108Pf;
import android.content.Context;
import com.bytedance.shadowhook.ShadowHook;

/* JADX INFO: loaded from: classes4.dex */
public class LinkerMProtectOpt {
    public static native void nStart();

    public static void start(Context context) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            C2112108Pf c2112108Pf = new C2112108Pf();
            c2112108Pf.LIZ = C08PL.SHARED.value;
            c2112108Pf.LIZIZ = true;
            ShadowHook.init(c2112108Pf.LIZ());
            nStart();
        }
    }
}
