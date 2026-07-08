package com.lynx.tasm.performance.longtasktiming;

import X.EnumC1299430jv3;
import X.EnumC1310010kC7;
import com.lynx.tasm.LynxEnv;

/* JADX INFO: loaded from: classes21.dex */
public class LynxLongTaskMonitor {
    public static final boolean LIZ = LynxEnv.getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_LONG_TASK_TIMING, false);
    public static volatile boolean LIZIZ = false;

    public static native void nativeDidProcessTask();

    public static native void nativeUpdateLongTaskTimingIfNeed(String str, String str2, String str3);

    public static native void nativeWillProcessTask(String str, String str2, String str3, int i);

    public static void LIZ() {
        if (LIZ) {
            if (!LIZIZ) {
                LIZIZ = LynxEnv.inst().isNativeLibraryLoaded();
            }
            if (LIZIZ) {
                nativeDidProcessTask();
            }
        }
    }

    public static boolean LIZIZ(String str, int i, EnumC1299430jv3 enumC1299430jv3) {
        if (enumC1299430jv3 == EnumC1299430jv3.FALSE || !LIZ) {
            return false;
        }
        if (!LIZIZ) {
            LIZIZ = LynxEnv.inst().isNativeLibraryLoaded();
        }
        if (!LIZIZ) {
            return false;
        }
        nativeWillProcessTask("platform_func_task", str, null, i);
        return true;
    }
}
