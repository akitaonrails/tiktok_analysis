package com.bytedance.sysoptimizer;

import X.C08PL;
import X.C2112108Pf;
import android.content.Context;
import android.os.Build;
import com.bytedance.shadowhook.ShadowHook;

/* JADX INFO: loaded from: classes4.dex */
public class JitMTKGVNOptimizer {
    public static volatile boolean isOptimized;

    public static native void doOptimize(boolean z, boolean z2, boolean z3);

    public static synchronized void fix(Context context, boolean z, boolean z2, boolean z3) {
        int i;
        if (!isOptimized && (((i = Build.VERSION.SDK_INT) == 24 || i == 25) && SysOptimizer.loadOptimizerLibrary(context))) {
            C2112108Pf c2112108Pf = new C2112108Pf();
            c2112108Pf.LIZ = C08PL.SHARED.value;
            c2112108Pf.LIZIZ = true;
            ShadowHook.init(c2112108Pf.LIZ());
            doOptimize(z, z2, z3);
            isOptimized = true;
        }
    }
}
