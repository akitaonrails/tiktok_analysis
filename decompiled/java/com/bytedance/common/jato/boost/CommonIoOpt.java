package com.bytedance.common.jato.boost;

import X.C2104908Ml;

/* JADX INFO: loaded from: classes4.dex */
public class CommonIoOpt {
    public static native void nResetIoPriority();

    public static native void nResetIoPriorityByTid(int i);

    public static native int nSetIoPriority(int i, int i2);

    public static native int nSetIoPriorityByTid(int i, int i2, int i3);

    public static native void nativeInit(String[] strArr, String[] strArr2);

    static {
        C2104908Ml.LIZIZ();
    }
}
