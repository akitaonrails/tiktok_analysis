package com.bytedance.common.jato.gfx;

import X.C2104908Ml;
import android.os.Build;
import android.os.Process;

/* JADX INFO: loaded from: classes27.dex */
public class RenderThreadOpt {
    public static native boolean nativeChangeRenderPipelineType(boolean z);

    public static native boolean nativePinImagesOpt();

    public static native boolean nativeResourceCacheOpt(int i);

    public static void LIZ() {
        if (Build.VERSION.SDK_INT >= 28 && Process.is64Bit()) {
            nativePinImagesOpt();
        }
    }

    static {
        C2104908Ml.LIZIZ();
    }

    public static void LIZIZ(int i) {
        int i2;
        if (Process.is64Bit() && (i2 = Build.VERSION.SDK_INT) >= 29 && i2 <= 32) {
            nativeResourceCacheOpt(i);
        }
    }
}
