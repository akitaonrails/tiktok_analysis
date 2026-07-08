package com.bytedance.common.jato.memory;

import X.C2104908Ml;

/* JADX INFO: loaded from: classes4.dex */
public class LessMadviseOpt {
    public static native void nAddLessMadviseFileName(String str);

    public static native void nSetLessMadviseEnabled(boolean z);

    static {
        C2104908Ml.LIZIZ();
    }

    public static void LIZ(String str) {
        if (C2104908Ml.LIZ()) {
            nAddLessMadviseFileName(str);
        }
    }

    public static void LIZIZ(boolean z) {
        if (C2104908Ml.LIZ()) {
            nSetLessMadviseEnabled(z);
        }
    }
}
