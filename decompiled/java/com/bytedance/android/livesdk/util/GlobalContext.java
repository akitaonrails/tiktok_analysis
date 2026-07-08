package com.bytedance.android.livesdk.util;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public class GlobalContext {
    public static Context sApplication;

    public static Context getApplicationContext() {
        return sApplication;
    }

    public static void setApplicationContext(Context context) {
        sApplication = context;
    }
}
