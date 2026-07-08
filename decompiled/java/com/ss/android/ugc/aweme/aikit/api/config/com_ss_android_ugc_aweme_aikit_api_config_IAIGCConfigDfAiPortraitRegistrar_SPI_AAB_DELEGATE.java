package com.ss.android.ugc.aweme.aikit.api.config;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.portrait.service.AIPortraitConfigRegistrar;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_aikit_api_config_IAIGCConfigDfAiPortraitRegistrar_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_aikit_api_config_IAIGCConfigDfAiPortraitRegistrar_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_aikit_api_config_IAIGCConfigDfAiPortraitRegistrar_SPI_AAB_DELEGATE();
    public static final C01GW AIPortraitConfigRegistrarinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(179));
    public static final int $stable = 8;

    private final AIPortraitConfigRegistrar getAIPortraitConfigRegistrarinstance() {
        return (AIPortraitConfigRegistrar) AIPortraitConfigRegistrarinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IAIGCConfigDfAiPortraitRegistrar> getServices() {
        ArrayList<IAIGCConfigDfAiPortraitRegistrar> arrayList = new ArrayList<>();
        arrayList.add(getAIPortraitConfigRegistrarinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IAIGCConfigDfAiPortraitRegistrar getService() {
        return getAIPortraitConfigRegistrarinstance();
    }
}
