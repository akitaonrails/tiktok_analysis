package com.bytedance.sysoptimizer;

import X.C08PL;
import X.C2112108Pf;
import android.content.Context;
import android.os.Build;
import com.bytedance.shadowhook.ShadowHook;

/* JADX INFO: loaded from: classes4.dex */
public class JitDebugInfoOptimizer {
    public static volatile boolean isOptimized;

    public static native void doOptimize(int i, boolean z);

    public static synchronized void install(Context context, boolean z) {
        int i;
        if (!isOptimized && (i = Build.VERSION.SDK_INT) >= 28 && SysOptimizer.loadOptimizerLibrary(context)) {
            C2112108Pf c2112108Pf = new C2112108Pf();
            c2112108Pf.LIZ = C08PL.SHARED.value;
            c2112108Pf.LIZIZ = true;
            ShadowHook.init(c2112108Pf.LIZ());
            doOptimize(i, z);
            isOptimized = true;
        }
    }
}
