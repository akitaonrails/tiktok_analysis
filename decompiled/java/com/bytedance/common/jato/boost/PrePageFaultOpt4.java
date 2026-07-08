package com.bytedance.common.jato.boost;

import X.C2104908Ml;

/* JADX INFO: loaded from: classes27.dex */
public class PrePageFaultOpt4 {
    public static native boolean mlockCodeOdex(int i, int i2);

    public static native void munlockCodeOdex();

    public static native void munlockInBackground();

    public static native boolean prePageFaultInner(int i, int i2);

    public static native boolean reclaimCodeOdex(int i);

    static {
        C2104908Ml.LIZIZ();
    }

    public static void prePageFault(int i, int i2) {
        prePageFaultInner(i, i2);
    }
}
