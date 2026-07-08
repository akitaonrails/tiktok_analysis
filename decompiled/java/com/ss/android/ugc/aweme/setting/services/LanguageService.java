package com.ss.android.ugc.aweme.setting.services;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.service.ILanguageService;

/* JADX INFO: loaded from: classes3.dex */
public final class LanguageService implements ILanguageService {
    @Override // com.ss.android.ugc.aweme.main.service.ILanguageService
    public final String getAppLanguage() {
        return ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage();
    }
}
