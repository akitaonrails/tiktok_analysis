package com.bytedance.sysoptimizer.java;

import android.content.Context;
import android.os.Build;
import java.util.Collections;

/* JADX INFO: loaded from: classes31.dex */
public class IAutofillManagerProtector {
    public static boolean sIsInit;

    public static void install(Context context) {
        if (Build.VERSION.SDK_INT < 26 || context == null || sIsInit) {
            return;
        }
        sIsInit = BinderServiceWrapperProtector.install(context, "autofill", Collections.singletonList("startSession"), "IAMP", BinderServiceWrapperProtector.VOID_ADMIN_RESULT);
    }
}
