package com.lynx.tasm.utils;

/* JADX INFO: loaded from: classes21.dex */
public class ColorUtils {
    public static native int nativeParse(String str);

    public static native boolean nativeValidate(String str);

    public static boolean LIZ(String str) {
        if (str != null && !str.isEmpty()) {
            return nativeValidate(str);
        }
        return false;
    }

    public static int LIZIZ(String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return 0;
        }
        return nativeParse(str);
    }
}
