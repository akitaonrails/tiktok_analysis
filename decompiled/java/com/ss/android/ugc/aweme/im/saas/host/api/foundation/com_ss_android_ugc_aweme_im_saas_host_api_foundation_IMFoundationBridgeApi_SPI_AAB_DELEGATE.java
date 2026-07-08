package com.ss.android.ugc.aweme.im.saas.host.api.foundation;

import X.C01GW;
import X.C04PD;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.foundation.IMFoundationBridgeService;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_foundation_IMFoundationBridgeApi_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_host_api_foundation_IMFoundationBridgeApi_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_foundation_IMFoundationBridgeApi_SPI_AAB_DELEGATE();
    public static final C01GW IMFoundationBridgeServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new C04PD());
    public static final int $stable = 8;

    private final IMFoundationBridgeService getIMFoundationBridgeServiceinstance() {
        return (IMFoundationBridgeService) IMFoundationBridgeServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMFoundationBridgeApi> getServices() {
        ArrayList<IMFoundationBridgeApi> arrayList = new ArrayList<>();
        arrayList.add(getIMFoundationBridgeServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMFoundationBridgeApi getService() {
        return getIMFoundationBridgeServiceinstance();
    }
}
