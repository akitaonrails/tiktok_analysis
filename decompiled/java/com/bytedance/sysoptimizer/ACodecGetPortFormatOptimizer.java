package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.bytehook.ByteHook;

/* JADX INFO: loaded from: classes4.dex */
public class ACodecGetPortFormatOptimizer {
    public static native void aCodecGetPortFormatOptimizer();

    public static native void aCodecGetPortFormatOptimizerByByteCode();

    public static boolean isUnderAndroidPAndAboveM() {
        int i = Build.VERSION.SDK_INT;
        return i < 28 && i > 23;
    }

    public static void fixACodecGetPortFormat(Context context) {
        if (isUnderAndroidPAndAboveM() && SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            aCodecGetPortFormatOptimizer();
            aCodecGetPortFormatOptimizerByByteCode();
        }
    }
}
