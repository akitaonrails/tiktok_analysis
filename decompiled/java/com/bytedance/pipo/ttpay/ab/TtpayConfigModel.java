package com.bytedance.pipo.ttpay.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class TtpayConfigModel {

    @C09CT("activated_toast_entrance")
    public final ActivatedToastSettingModel activatedToastSetting;

    @C09CT("ec_cashier_refresh_entrances")
    public final List<String> ecCashierRefreshEntrances;

    @C09CT("events_portal_need_publish")
    public final List<TtpayEventModel> eventsPortalNeedPublish;

    @C09CT("gecko_preload")
    public final List<String> geckoChannels;

    @C09CT("loading_config")
    public final TtpayLoadingConfig loadingConfig;

    @C09CT("ttpay_logo")
    public final TTPayLogoImage logoImage;

    @C09CT("onboarding_template_map")
    public final PipoTtpayOnboardingTemplateMapModel onBoardingTemplateMap;

    public TtpayConfigModel() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public TtpayConfigModel(List<String> list, TtpayLoadingConfig ttpayLoadingConfig, ActivatedToastSettingModel activatedToastSettingModel, PipoTtpayOnboardingTemplateMapModel pipoTtpayOnboardingTemplateMapModel, TTPayLogoImage tTPayLogoImage, List<String> list2, List<TtpayEventModel> list3) {
        this.geckoChannels = list;
        this.loadingConfig = ttpayLoadingConfig;
        this.activatedToastSetting = activatedToastSettingModel;
        this.onBoardingTemplateMap = pipoTtpayOnboardingTemplateMapModel;
        this.logoImage = tTPayLogoImage;
        this.ecCashierRefreshEntrances = list2;
        this.eventsPortalNeedPublish = list3;
    }

    public TtpayConfigModel(List list, TtpayLoadingConfig ttpayLoadingConfig, ActivatedToastSettingModel activatedToastSettingModel, PipoTtpayOnboardingTemplateMapModel pipoTtpayOnboardingTemplateMapModel, TTPayLogoImage tTPayLogoImage, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? new TtpayLoadingConfig(null, 3000L, 15000L) : ttpayLoadingConfig, (i & 4) != 0 ? new ActivatedToastSettingModel(null, 0L, 3, null) : activatedToastSettingModel, (i & 8) != 0 ? new PipoTtpayOnboardingTemplateMapModel(null, null, 3, null) : pipoTtpayOnboardingTemplateMapModel, (i & 16) == 0 ? tTPayLogoImage : null, (i & 32) != 0 ? C13BV.INSTANCE : list2, (i & 64) != 0 ? C13BV.INSTANCE : list3);
    }
}
