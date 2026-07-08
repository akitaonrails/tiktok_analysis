package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public class EglCreateSurfaceFixer {
    public static boolean sInited;

    public static native void fix(int i);

    public static synchronized void fix(Context context, int i) {
        if (sInited) {
            return;
        }
        sInited = true;
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            fix(i);
        }
    }

    public static synchronized void fixHuawei(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 26 || i2 == 27) {
            String str = Build.MANUFACTURER;
            if (str.equalsIgnoreCase("HUAWEI") || str.equalsIgnoreCase("HONOR")) {
                fix(context, i);
            }
        }
    }

    public static synchronized void fixOsOP(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i2 <= 28) {
            fix(context, i);
        }
    }
}
