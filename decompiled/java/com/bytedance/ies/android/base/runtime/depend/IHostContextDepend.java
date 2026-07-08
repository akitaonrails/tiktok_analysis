package com.bytedance.ies.android.base.runtime.depend;

import X.C1030590cvR;
import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes17.dex */
public interface IHostContextDepend {
    public static final C1030590cvR Companion = new Object() { // from class: X.0cvR
    };

    int getAppId();

    String getAppName();

    Application getApplication();

    Context getApplicationContext();

    String getBoeChannel();

    String getChannel();

    String getCurrentTelcomCarrier();

    String getDeviceId();

    String getLanguage();

    String getPPEChannel();

    String getPackageName();

    String getRegion();

    String getSkinName();

    String getSkinType();

    String getUpdateVersion();

    String getUserAgent();

    long getVersionCode();

    String getVersionName();

    boolean isBoeEnable();

    boolean isDebuggable();

    boolean isMiniAppEnable();

    boolean isPPEEnable();

    boolean isTeenMode();
}
