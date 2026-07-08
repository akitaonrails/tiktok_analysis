package com.ss.android.ugc.aweme.im.saas.host.api.setting;

import X.C01GW;
import X.C04PG;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.settings.IMSettingBridgeService;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_setting_IMSettingBridgeApi_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_host_api_setting_IMSettingBridgeApi_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_setting_IMSettingBridgeApi_SPI_AAB_DELEGATE();
    public static final C01GW IMSettingBridgeServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new C04PG());
    public static final int $stable = 8;

    private final IMSettingBridgeService getIMSettingBridgeServiceinstance() {
        return (IMSettingBridgeService) IMSettingBridgeServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMSettingBridgeApi> getServices() {
        ArrayList<IMSettingBridgeApi> arrayList = new ArrayList<>();
        arrayList.add(getIMSettingBridgeServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMSettingBridgeApi getService() {
        return getIMSettingBridgeServiceinstance();
    }
}
