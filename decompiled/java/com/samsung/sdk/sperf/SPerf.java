package com.samsung.sdk.sperf;

import android.content.Context;

/* JADX INFO: loaded from: classes32.dex */
public class SPerf {
    public static SPerfManager sPerfManager;

    public static int getVersionCode() {
        return 1;
    }

    public static String getVersionName() {
        return "v1.0.0";
    }

    public static boolean initialize(Context context) {
        if (context == null || !Boost.init()) {
            return false;
        }
        SPerfManager sPerfManagerCreateInstance = SPerfManager.createInstance(context);
        sPerfManager = sPerfManagerCreateInstance;
        return sPerfManagerCreateInstance != null;
    }

    public static boolean isFeatureEnabled(int i) {
        return sPerfManager != null;
    }

    public static void setDebugModeEnabled(boolean z) {
        SPerfUtil.setDebug(z);
    }
}
