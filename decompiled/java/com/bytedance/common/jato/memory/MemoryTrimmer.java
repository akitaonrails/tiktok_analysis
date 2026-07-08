package com.bytedance.common.jato.memory;

import X.C2104908Ml;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class MemoryTrimmer {
    public static native boolean nTrim(String str, float f, boolean z, boolean z2, boolean z3, boolean z4);

    public static void LIZ(Context context, float f, boolean z, boolean z2, boolean z3, boolean z4) {
        if (context == null || !C2104908Ml.LIZIZ()) {
            return;
        }
        try {
            nTrim(context.getPackageName(), f, z, z2, z3, z4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
