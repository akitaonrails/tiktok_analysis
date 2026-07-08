package com.bytedance.sdk.xbridge.runtime.depend;

import X.C1873070yqH;
import X.C1873100yqK;
import android.app.Application;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public interface IHostContextDepend {
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

    List<C1873100yqK> getSettings(List<C1873070yqH> list);

    String getSkinName();

    String getUpdateVersion();

    String getVersionName();

    boolean isBoeEnable();

    boolean isDebuggable();

    boolean isPPEEnable();

    boolean isTeenMode();
}
