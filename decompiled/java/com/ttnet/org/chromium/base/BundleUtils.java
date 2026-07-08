package com.ttnet.org.chromium.base;

import X.C830490Whz;
import X.C830530Wi3;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class BundleUtils {
    public static final Map<String, ClassLoader> LIZ;

    public static String getNativeLibraryPath(String str, String str2) {
        return "";
    }

    public static boolean isBundleForNative() {
        return false;
    }

    static {
        new C830530Wi3();
        LIZ = Collections.synchronizedMap(new C830490Whz());
    }
}
