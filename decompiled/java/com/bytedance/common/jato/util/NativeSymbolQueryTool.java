package com.bytedance.common.jato.util;

import X.C2104908Ml;

/* JADX INFO: loaded from: classes4.dex */
public class NativeSymbolQueryTool {
    public static native int nativeDlsymResult(String str, String str2);

    public static int LIZ(String str, String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || !C2104908Ml.LIZIZ()) {
            return 0;
        }
        return nativeDlsymResult(str, str2);
    }
}
