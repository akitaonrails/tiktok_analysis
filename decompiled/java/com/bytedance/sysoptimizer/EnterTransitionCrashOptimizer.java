package com.bytedance.sysoptimizer;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class EnterTransitionCrashOptimizer {
    public static Context sContext;

    public static Context getContext() {
        return sContext;
    }

    public static void fix(Context context) {
        sContext = context;
    }
}
