package com.ss.bytertc.base.data;

import X.C786410Ut5;
import android.content.Context;
import com.bytedance.realx.base.ContextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class LyraxContextUtils {
    public static Context applicationContext;

    public static Context getApplicationContext() {
        return ContextUtils.getApplicationContext();
    }

    public static void initialize(Context context) {
        if (context != null) {
            ContextUtils.initialize(C786410Ut5.N3(context));
            return;
        }
        throw new IllegalArgumentException("Application context cannot be null for ContextUtils.initialize.");
    }
}
