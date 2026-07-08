package com.bytedance.common.jato.boost.sched;

import X.C2104908Ml;

/* JADX INFO: loaded from: classes27.dex */
public class ThreadPrioProtector {
    public static native void addThreadPrioProtect(int i, int i2, int i3);

    public static native void nativeInit();

    public static native void setPrioProtectEnabled(boolean z);

    static {
        C2104908Ml.LIZIZ();
    }
}
