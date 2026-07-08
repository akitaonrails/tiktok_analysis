package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application;

import X.C05FI;
import X.C1724400uyU;
import X.InterfaceC911603hK;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes27.dex */
public final class DefaultApplicationDependencyService implements IApplicationDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public boolean boeCanUse() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public int getAppId() {
        return 123456;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public String getAppName() {
        return "shop";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public String getChannel() {
        return "debug";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public Activity getCurrentActivity() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public InterfaceC911603hK getRootPageMonitor() {
        return null;
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public boolean isAppHot() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public boolean isColdStart() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public boolean isDebug() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public boolean isFirstInstallAndFirstLaunch() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public boolean isHippo() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public boolean isLocalTest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public boolean isOffline() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public boolean isPad() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public boolean isRegressionTest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public Application getApplication() {
        return new Application();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public Context getApplicationContext() {
        throw new C05FI("AppContextDependencyService not inject in host application");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public Resources getResources() {
        throw new C05FI("AppContextDependencyService not inject in host application");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public C1724400uyU getVersionInfo() {
        return new C1724400uyU("1.0", 1L, 1L, "1.0");
    }
}
