package com.bytedance.common.jato.boost.sched;

import X.C2104908Ml;

/* JADX INFO: loaded from: classes4.dex */
public class PriorityManagerV2 {
    public static native void fetchRenderThreadTid();

    public static native int getRenderThreadTid();

    public static native int nativeResetPriority(int i);

    public static native int nativeSetPriority(int i, int i2);

    static {
        C2104908Ml.LIZIZ();
    }
}
