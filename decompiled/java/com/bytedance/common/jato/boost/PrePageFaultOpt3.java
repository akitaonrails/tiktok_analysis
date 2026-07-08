package com.bytedance.common.jato.boost;

import X.C2104908Ml;

/* JADX INFO: loaded from: classes27.dex */
public class PrePageFaultOpt3 {
    public static native boolean mlockCodeItem(int i);

    public static native void munlockCodeItem();

    public static native void munlockInBackground();

    public static native boolean prePageFaultInner(int i, int i2);

    public static native boolean reclaimCodeItem(int i);

    public static native boolean reclaimPluginCodeItem(int i, String str, ClassLoader classLoader);

    static {
        C2104908Ml.LIZIZ();
    }

    public static void prePageFault(int i, int i2) {
        prePageFaultInner(i, i2);
    }
}
