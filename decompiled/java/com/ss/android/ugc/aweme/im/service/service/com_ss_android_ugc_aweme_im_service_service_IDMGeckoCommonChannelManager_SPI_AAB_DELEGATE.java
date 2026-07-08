package com.ss.android.ugc.aweme.im.service.service;

import X.AnonymousClass0206;
import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.resource.DMGeckoCommonChannelManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class com_ss_android_ugc_aweme_im_service_service_IDMGeckoCommonChannelManager_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_service_service_IDMGeckoCommonChannelManager_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_service_service_IDMGeckoCommonChannelManager_SPI_AAB_DELEGATE();
    public static final C01GW Serviceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AnonymousClass0206.get$arr$(194));

    private final DMGeckoCommonChannelManager.Service getServiceinstance() {
        return (DMGeckoCommonChannelManager.Service) Serviceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IDMGeckoCommonChannelManager> getServices() {
        ArrayList<IDMGeckoCommonChannelManager> arrayList = new ArrayList<>();
        arrayList.add(getServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IDMGeckoCommonChannelManager getService() {
        return getServiceinstance();
    }
}
