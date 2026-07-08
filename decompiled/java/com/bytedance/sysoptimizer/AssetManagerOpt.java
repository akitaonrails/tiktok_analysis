package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.os.Process;

/* JADX INFO: loaded from: classes4.dex */
public class AssetManagerOpt {
    public static native int nHookAssetManager(int i);

    public static int hookAssetManager(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i <= 30 && SysOptimizer.loadOptimizerLibrary(context) && Process.is64Bit()) {
            return nHookAssetManager(i);
        }
        return -1;
    }
}
