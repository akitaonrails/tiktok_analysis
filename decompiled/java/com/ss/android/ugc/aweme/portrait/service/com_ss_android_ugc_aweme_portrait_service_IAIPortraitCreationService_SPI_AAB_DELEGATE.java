package com.ss.android.ugc.aweme.portrait.service;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_portrait_service_IAIPortraitCreationService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_portrait_service_IAIPortraitCreationService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_portrait_service_IAIPortraitCreationService_SPI_AAB_DELEGATE();
    public static final C01GW AIPortraitCreationServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(602));
    public static final int $stable = 8;

    private final AIPortraitCreationServiceImpl getAIPortraitCreationServiceImplinstance() {
        return (AIPortraitCreationServiceImpl) AIPortraitCreationServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IAIPortraitCreationService> getServices() {
        ArrayList<IAIPortraitCreationService> arrayList = new ArrayList<>();
        arrayList.add(getAIPortraitCreationServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IAIPortraitCreationService getService() {
        return getAIPortraitCreationServiceImplinstance();
    }
}
