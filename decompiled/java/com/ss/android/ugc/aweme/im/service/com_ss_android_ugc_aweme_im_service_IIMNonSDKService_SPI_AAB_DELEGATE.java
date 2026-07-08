package com.ss.android.ugc.aweme.im.service;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.service.provider.IMNonSDKService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_service_IIMNonSDKService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_service_IIMNonSDKService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_service_IIMNonSDKService_SPI_AAB_DELEGATE();
    public static final C01GW IMNonSDKServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(514));

    private final IMNonSDKService getIMNonSDKServiceinstance() {
        return (IMNonSDKService) IMNonSDKServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IIMNonSDKService> getServices() {
        ArrayList<IIMNonSDKService> arrayList = new ArrayList<>();
        arrayList.add(getIMNonSDKServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IIMNonSDKService getService() {
        return getIMNonSDKServiceinstance();
    }
}
