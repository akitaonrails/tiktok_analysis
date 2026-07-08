package com.bytedance.ies.ugc.appcontext;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes35.dex */
public interface IAppContextService {
    String LIZ();

    long LIZIZ();

    String LIZJ();

    boolean LIZLLL();

    int LJ();

    String LJFF();

    int getAppId();

    String getAppName();

    Application getApplication();

    Context getApplicationContext();

    String getChannel();

    Activity getCurrentActivity();

    long getUpdateVersionCode();

    long getVersionCode();

    String getVersionName();

    boolean isAppBackground();

    boolean isDebug();

    boolean isOffline();

    boolean isRegressionTest();
}
