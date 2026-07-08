package com.bytedance.ies.xbridge.base.runtime.depend;

import X.C1168160gVK;
import X.C1168200gVO;
import X.C1878300yyi;
import android.app.Application;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public interface IHostContextDepend {
    public static final C1878300yyi Companion = new Object() { // from class: X.0yyi
    };

    int getAppId();

    String getAppName();

    Application getApplication();

    Context getApplicationContext();

    String getBoeChannel();

    String getChannel();

    String getCurrentTelcomCarrier();

    String getDeviceId();

    int getExactAppId();

    String getFullLanguage();

    String getLanguage();

    String getPPEChannel();

    String getPackageName();

    List<C1168160gVK> getSettings(List<C1168200gVO> list);

    String getSkinName();

    String getSkinType();

    String getUpdateVersion();

    long getVersionCode();

    String getVersionName();

    boolean isBoeEnable();

    boolean isDebuggable();

    boolean isPPEEnable();

    boolean isTeenMode();
}
