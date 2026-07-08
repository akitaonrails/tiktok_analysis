package com.ss.android.ugc.aweme.ecommerce.dependency.appsetting;

import X.C04TD;
import X.C0CLW;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public final class AppSettingDependencyService implements IAppSettingDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService
    public List<String> getEmailLoginDomainSettings() {
        return C0CLW.LIZIZ.LIZ.getEmailLoginSettings().getDomainRecommendation();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService
    public String getAppLanguage() {
        return ((ILanguageService) ServiceManager.get().getService(ILanguageService.class)).getAppLanguage();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService
    public Locale getCountryLocale() {
        return ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getCountryLocale();
    }

    public static IAppSettingDependencyService createIAppSettingDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IAppSettingDependencyService.class, z);
        if (objLIZ != null) {
            return (IAppSettingDependencyService) objLIZ;
        }
        if (C04TD.LLZZLLIL == null) {
            synchronized (IAppSettingDependencyService.class) {
                if (C04TD.LLZZLLIL == null) {
                    C04TD.LLZZLLIL = new AppSettingDependencyService();
                }
            }
        }
        return C04TD.LLZZLLIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService
    public String getCurrentLocaleStr(Context context) {
        String strLIZ = ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getCurrentI18nItem(context).LIZ();
        if (strLIZ == null) {
            return "";
        }
        return strLIZ;
    }
}
