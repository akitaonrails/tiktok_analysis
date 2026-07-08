package com.bytedance.common.jato.gfx;

import X.C0V4J;
import X.C2104908Ml;
import com.bytedance.android.bytehook.ByteHook;

/* JADX INFO: loaded from: classes14.dex */
public class GLESInitBoost {
    public static boolean LIZ;

    public static native int nativeBoost(boolean z);

    public static synchronized void LIZ(boolean z) {
        if (LIZ) {
            return;
        }
        LIZ = true;
        if (!C2104908Ml.LIZIZ()) {
            return;
        }
        ByteHook.init(new C0V4J().LIZ());
        nativeBoost(z);
    }
}
