package com.bytedance.common.jato.memory;

import X.C09Q9;
import X.C2104908Ml;

/* JADX INFO: loaded from: classes4.dex */
public class ResourceMetricCollector {
    public static final long[] LIZ = new long[4];

    public static native void nativeGetMallocInfo(long[] jArr);

    public static C09Q9 LIZ() {
        C09Q9 c09q9 = new C09Q9();
        long[] jArr = LIZ;
        if (C2104908Ml.LIZIZ()) {
            nativeGetMallocInfo(jArr);
        }
        c09q9.LIZ = jArr[0];
        c09q9.LIZIZ = jArr[1];
        c09q9.LIZJ = jArr[2];
        c09q9.LIZLLL = jArr[3];
        return c09q9;
    }
}
