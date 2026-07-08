package com.bytedance.common.jato.memory;

import X.C2104908Ml;

/* JADX INFO: loaded from: classes34.dex */
public final class HeapGcParamsOpt {
    public static native int nativeAdjustHeapGcParameters(long j, long j2, double d);

    public static void LIZ(double d, long j, long j2) {
        if (!C2104908Ml.LIZIZ()) {
            return;
        }
        nativeAdjustHeapGcParameters(j, j2, d);
    }
}
