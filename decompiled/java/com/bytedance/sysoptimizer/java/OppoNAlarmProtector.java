package com.bytedance.sysoptimizer.java;

import android.content.Context;
import android.os.Build;
import java.util.Collections;

/* JADX INFO: loaded from: classes31.dex */
public class OppoNAlarmProtector {
    public static boolean sIsInit;

    public static void install(Context context) {
        if (Build.VERSION.SDK_INT != 25 || !Build.MANUFACTURER.equals("oppo") || context == null || sIsInit) {
            return;
        }
        sIsInit = BinderServiceWrapperProtector.install(context, "alarm", Collections.singletonList("set"), "OppoNAlarm", BinderServiceWrapperProtector.VOID_ADMIN_RESULT);
    }
}
