package com.bytedance.sysoptimizer;

import android.content.Context;
import com.bytedance.android.bytehook.ByteHook;

/* JADX INFO: loaded from: classes14.dex */
public class SuspendAllOpt {
    public static boolean sOptimized;

    public static native boolean suspendAllStart();

    public static boolean start(Context context) {
        if (sOptimized || !SysOptimizer.loadOptimizerLibrary(context)) {
            return false;
        }
        ByteHook.init();
        boolean zSuspendAllStart = suspendAllStart();
        sOptimized = true;
        return zSuspendAllStart;
    }
}
