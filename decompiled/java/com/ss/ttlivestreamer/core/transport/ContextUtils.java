package com.ss.ttlivestreamer.core.transport;

import X.C1319870kS1;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Process;
import android.preference.PreferenceManager;

/* JADX INFO: loaded from: classes21.dex */
public class ContextUtils {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static Context sApplicationContext;

    public static SharedPreferences fetchAppSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(sApplicationContext);
    }

    public static AssetManager getApplicationAssets() {
        Context applicationContext = getApplicationContext();
        while (applicationContext instanceof ContextWrapper) {
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        return applicationContext.getAssets();
    }

    public static boolean isIsolatedProcess() {
        return Process.isIsolated();
    }

    public static SharedPreferences getAppSharedPreferences() {
        return C1319870kS1.LIZ;
    }

    public static Context getApplicationContext() {
        return sApplicationContext;
    }

    public static void initApplicationContext(Context context) {
        initJavaSideApplicationContext(context);
    }

    public static void initApplicationContextForTests(Context context) {
        initJavaSideApplicationContext(context);
        C1319870kS1.LIZ = fetchAppSharedPreferences();
    }

    public static void initJavaSideApplicationContext(Context context) {
        if (context instanceof Application) {
            context = new ContextWrapper(context);
        }
        sApplicationContext = context;
    }
}
