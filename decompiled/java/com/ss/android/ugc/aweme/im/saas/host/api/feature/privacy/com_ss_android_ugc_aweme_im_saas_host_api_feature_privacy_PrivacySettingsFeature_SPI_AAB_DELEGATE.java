package com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy;

import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.service.privacy.IMPrivacySettingsImpl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_feature_privacy_PrivacySettingsFeature_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_host_api_feature_privacy_PrivacySettingsFeature_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_feature_privacy_PrivacySettingsFeature_SPI_AAB_DELEGATE();

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public PrivacySettingsFeature getService() {
        return new IMPrivacySettingsImpl();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<PrivacySettingsFeature> getServices() {
        ArrayList<PrivacySettingsFeature> arrayList = new ArrayList<>();
        arrayList.add(new IMPrivacySettingsImpl());
        return arrayList;
    }
}
