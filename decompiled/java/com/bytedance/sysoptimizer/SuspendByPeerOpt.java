package com.bytedance.sysoptimizer;

import android.content.Context;
import com.bytedance.android.bytehook.ByteHook;

/* JADX INFO: loaded from: classes14.dex */
public class SuspendByPeerOpt {
    public static boolean sOptimized;

    public static native int nStart(boolean z);

    public static int start(Context context, boolean z) {
        if (sOptimized || !SysOptimizer.loadOptimizerLibrary(context)) {
            return -1;
        }
        ByteHook.init();
        int iNStart = nStart(z);
        sOptimized = true;
        return iNStart;
    }
}
