package com.ss.android.ugc.aweme.aikit.api.config;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.theater.config.AITheaterConfigRegistrar;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_aikit_api_config_IAIGCConfigDfAiTheaterRegistrar_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_aikit_api_config_IAIGCConfigDfAiTheaterRegistrar_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_aikit_api_config_IAIGCConfigDfAiTheaterRegistrar_SPI_AAB_DELEGATE();
    public static final C01GW AITheaterConfigRegistrarinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(180));

    private final AITheaterConfigRegistrar getAITheaterConfigRegistrarinstance() {
        return (AITheaterConfigRegistrar) AITheaterConfigRegistrarinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IAIGCConfigDfAiTheaterRegistrar> getServices() {
        ArrayList<IAIGCConfigDfAiTheaterRegistrar> arrayList = new ArrayList<>();
        arrayList.add(getAITheaterConfigRegistrarinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IAIGCConfigDfAiTheaterRegistrar getService() {
        return getAITheaterConfigRegistrarinstance();
    }
}
