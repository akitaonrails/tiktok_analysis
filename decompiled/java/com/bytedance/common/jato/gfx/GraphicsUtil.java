package com.bytedance.common.jato.gfx;

import X.C2104908Ml;
import X.C2112108Pf;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class GraphicsUtil {
    public static boolean LIZ;

    public static native void nativeEnableResourceCleanup();

    public static void LIZ() {
        synchronized (GraphicsUtil.class) {
            try {
                if (LIZ) {
                    return;
                }
                LIZ = true;
                if (C2104908Ml.LIZIZ()) {
                    ShadowHook.init(new C2112108Pf().LIZ());
                    nativeEnableResourceCleanup();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
