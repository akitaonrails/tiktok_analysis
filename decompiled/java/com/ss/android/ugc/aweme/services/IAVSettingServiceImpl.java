package com.ss.android.ugc.aweme.services;

import X.InterfaceC1910030znt;
import X.InterfaceC19279210be;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class IAVSettingServiceImpl implements IAVSettingService {
    public final ISettingService settingService = (ISettingService) ServiceManager.get().getService(ISettingService.class);

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public String getAppLanguage() {
        return this.settingService.getAppLanguage();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public String getAppLogRegion() {
        return this.settingService.getAppLogRegion();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public Locale getCountryLocale() {
        return this.settingService.getCountryLocale();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public Map<String, InterfaceC1910030znt> getLocaleMap() {
        return this.settingService.getLocaleMap();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public String getSysLanguage() {
        return this.settingService.getSysLanguage();
    }

    public boolean isKorean() {
        return this.settingService.isKorean();
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public boolean getSaveAtPost() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("disable_save_at_post", false);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public InterfaceC1910030znt getCurrentI18nItem(Context context) {
        return this.settingService.getCurrentI18nItem(context);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public Locale getLocale(String str) {
        return this.settingService.getLocale(str);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IAVSettingService
    public void requestTurnOnAdAuthorization(Context context, InterfaceC19279210be interfaceC19279210be) {
        this.settingService.requestTurnOnAdAuthorization(context, interfaceC19279210be);
    }
}
