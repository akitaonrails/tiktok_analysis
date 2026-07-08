package com.lynx.tasm.featurecount;

import X.EnumC1310010kC7;
import com.lynx.tasm.LynxEnv;

/* JADX INFO: loaded from: classes21.dex */
public class LynxFeatureCounter {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ = LynxEnv.getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_FEATURE_COUNTER, false);

    public static native void nativeFeatureCount(int i, int i2);

    public static void LIZ(int i, int i2) {
        if (!LIZIZ) {
            return;
        }
        if (!LIZ) {
            LIZ = LynxEnv.inst().isNativeLibraryLoaded();
        }
        if (LIZ) {
            nativeFeatureCount(i, i2);
        }
    }
}
