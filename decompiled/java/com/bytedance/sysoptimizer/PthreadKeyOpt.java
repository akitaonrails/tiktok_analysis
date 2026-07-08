package com.bytedance.sysoptimizer;

import X.C08PL;
import X.C2112108Pf;
import android.content.Context;
import com.bytedance.shadowhook.ShadowHook;

/* JADX INFO: loaded from: classes4.dex */
public class PthreadKeyOpt {
    public static native int nStart(int i, boolean z, String str);

    public static int start(Context context, int i, boolean z, String str) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            C2112108Pf c2112108Pf = new C2112108Pf();
            c2112108Pf.LIZ = C08PL.SHARED.value;
            c2112108Pf.LIZIZ = true;
            ShadowHook.init(c2112108Pf.LIZ());
            return nStart(i, z, str);
        }
        return -1;
    }
}
