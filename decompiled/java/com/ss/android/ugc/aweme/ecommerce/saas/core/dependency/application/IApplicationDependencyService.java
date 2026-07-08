package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application;

import X.C1724400uyU;
import X.InterfaceC911603hK;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;

/* JADX INFO: loaded from: classes24.dex */
public interface IApplicationDependencyService extends IECommerceHostService {
    boolean boeCanUse();

    int getAppId();

    String getAppName();

    Application getApplication();

    Context getApplicationContext();

    String getChannel();

    Activity getCurrentActivity();

    Resources getResources();

    InterfaceC911603hK getRootPageMonitor();

    C1724400uyU getVersionInfo();

    boolean isAppHot();

    boolean isColdStart();

    boolean isDebug();

    boolean isFirstInstallAndFirstLaunch();

    boolean isHippo();

    boolean isLocalTest();

    boolean isOffline();

    boolean isPad();

    boolean isRegressionTest();
}
