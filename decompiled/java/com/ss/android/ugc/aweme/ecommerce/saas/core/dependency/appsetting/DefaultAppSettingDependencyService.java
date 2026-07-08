package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting;

import X.C13BV;
import android.content.Context;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes27.dex */
public final class DefaultAppSettingDependencyService implements IAppSettingDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService
    public String getAppLanguage() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService
    public String getCurrentLocaleStr(Context context) {
        return "";
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService
    public Locale getCountryLocale() {
        return new Locale("");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService
    public List<String> getEmailLoginDomainSettings() {
        return C13BV.INSTANCE;
    }
}
