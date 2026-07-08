package com.ttnet.org.chromium.base;

import X.C787230UuP;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class JNIUtils {
    public static Boolean LIZ;

    public static boolean isSelectiveJniRegistrationEnabled() {
        if (LIZ == null) {
            LIZ = Boolean.FALSE;
        }
        return LIZ.booleanValue();
    }

    public static ClassLoader getSplitClassLoader(String str) {
        String[] strArr;
        Context context = C787230UuP.LIZ;
        if (!TextUtils.isEmpty(str) && Build.VERSION.SDK_INT >= 26 && (strArr = context.getApplicationInfo().splitNames) != null && Arrays.asList(strArr).contains(str)) {
            return context.getClassLoader();
        }
        return JNIUtils.class.getClassLoader();
    }
}
