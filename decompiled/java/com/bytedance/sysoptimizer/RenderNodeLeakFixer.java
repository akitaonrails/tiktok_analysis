package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public class RenderNodeLeakFixer {
    public static boolean sInited;

    public static native void fixRenderNodeLeak();

    public static void fix(Context context) {
        if (sInited) {
            return;
        }
        sInited = true;
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            fixRenderNodeLeak();
        }
    }

    public static void fixAndroidN(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i == 24 || i == 25) {
            fix(context);
        }
    }
}
