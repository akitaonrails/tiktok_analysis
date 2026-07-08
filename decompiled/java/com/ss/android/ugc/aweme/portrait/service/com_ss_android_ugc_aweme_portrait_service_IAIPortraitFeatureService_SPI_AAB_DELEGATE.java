package com.ss.android.ugc.aweme.portrait.service;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_portrait_service_IAIPortraitFeatureService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_portrait_service_IAIPortraitFeatureService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_portrait_service_IAIPortraitFeatureService_SPI_AAB_DELEGATE();
    public static final C01GW AIPortraitFeatureServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(604));
    public static final int $stable = 8;

    private final AIPortraitFeatureServiceImpl getAIPortraitFeatureServiceImplinstance() {
        return (AIPortraitFeatureServiceImpl) AIPortraitFeatureServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IAIPortraitFeatureService> getServices() {
        ArrayList<IAIPortraitFeatureService> arrayList = new ArrayList<>();
        arrayList.add(getAIPortraitFeatureServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IAIPortraitFeatureService getService() {
        return getAIPortraitFeatureServiceImplinstance();
    }
}
