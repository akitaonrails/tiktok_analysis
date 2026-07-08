package com.ss.android.ugc.aweme.im.saas.host.api.im;

import X.C01GW;
import X.C04PE;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.im.IMHostService;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_im_IMHostApi_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_host_api_im_IMHostApi_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_im_IMHostApi_SPI_AAB_DELEGATE();
    public static final C01GW IMHostServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new C04PE());
    public static final int $stable = 8;

    private final IMHostService getIMHostServiceinstance() {
        return (IMHostService) IMHostServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMHostApi> getServices() {
        ArrayList<IMHostApi> arrayList = new ArrayList<>();
        arrayList.add(getIMHostServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMHostApi getService() {
        return getIMHostServiceinstance();
    }
}
