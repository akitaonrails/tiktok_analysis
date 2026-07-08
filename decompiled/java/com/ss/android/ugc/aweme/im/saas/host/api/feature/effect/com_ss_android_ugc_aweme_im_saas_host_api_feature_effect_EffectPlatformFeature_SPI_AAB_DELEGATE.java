package com.ss.android.ugc.aweme.im.saas.host.api.feature.effect;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.effect.IMEffectPlatformService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_feature_effect_EffectPlatformFeature_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_host_api_feature_effect_EffectPlatformFeature_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_feature_effect_EffectPlatformFeature_SPI_AAB_DELEGATE();
    public static final C01GW IMEffectPlatformServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(412));
    public static final int $stable = 8;

    private final IMEffectPlatformService getIMEffectPlatformServiceinstance() {
        return (IMEffectPlatformService) IMEffectPlatformServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<EffectPlatformFeature> getServices() {
        ArrayList<EffectPlatformFeature> arrayList = new ArrayList<>();
        arrayList.add(getIMEffectPlatformServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public EffectPlatformFeature getService() {
        return getIMEffectPlatformServiceinstance();
    }
}
