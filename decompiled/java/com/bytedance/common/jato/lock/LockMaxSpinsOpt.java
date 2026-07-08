package com.bytedance.common.jato.lock;

import X.C2104908Ml;

/* JADX INFO: loaded from: classes27.dex */
public class LockMaxSpinsOpt {
    public static native void nativeSetMaxSpins(int i);

    static {
        C2104908Ml.LIZIZ();
    }

    public static void setLockMaxSpins(int i) {
        nativeSetMaxSpins(i);
    }
}
