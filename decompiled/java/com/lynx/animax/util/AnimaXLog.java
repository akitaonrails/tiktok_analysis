package com.lynx.animax.util;

import X.C0WLT;

/* JADX INFO: loaded from: classes14.dex */
public class AnimaXLog {
    public static native void nativeLog(int i, String str, String str2);

    public static void LIZ(String str, String str2) {
        C0WLT c0wlt = C0WLT.ERROR;
        if (AnimaX.LIZJ().LIZ) {
            nativeLog(c0wlt.ordinal(), str, str2);
        }
    }

    public static void LIZIZ(String str, String str2) {
        C0WLT c0wlt = C0WLT.INFO;
        if (AnimaX.LIZJ().LIZ) {
            nativeLog(c0wlt.ordinal(), str, str2);
        }
    }

    public static void LIZJ(String str, String str2) {
        C0WLT c0wlt = C0WLT.WARN;
        if (AnimaX.LIZJ().LIZ) {
            nativeLog(c0wlt.ordinal(), str, str2);
        }
    }
}
