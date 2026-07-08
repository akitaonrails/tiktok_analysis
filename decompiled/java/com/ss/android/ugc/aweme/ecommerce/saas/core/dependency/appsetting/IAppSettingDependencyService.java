package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public interface IAppSettingDependencyService extends IECommerceHostService {
    String getAppLanguage();

    Locale getCountryLocale();

    String getCurrentLocaleStr(Context context);

    List<String> getEmailLoginDomainSettings();
}
