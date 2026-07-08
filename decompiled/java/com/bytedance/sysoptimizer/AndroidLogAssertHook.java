package com.bytedance.sysoptimizer;

import android.content.Context;
import com.bytedance.android.bytehook.ByteHook;

/* JADX INFO: loaded from: classes4.dex */
public class AndroidLogAssertHook {
    public static volatile boolean isHooked;

    public static native void hookAssert(String str, String str2);

    public static synchronized void hookAndroidLogAssert(Context context, String str, String str2) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            hookAssert(str, str2);
            isHooked = true;
        }
    }
}
