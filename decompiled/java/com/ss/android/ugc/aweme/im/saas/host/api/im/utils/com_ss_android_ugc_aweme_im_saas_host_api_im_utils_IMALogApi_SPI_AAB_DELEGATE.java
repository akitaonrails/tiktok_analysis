package com.ss.android.ugc.aweme.im.saas.host.api.im.utils;

import X.C01GW;
import X.C04PF;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.im.utils.IMALogService;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_im_utils_IMALogApi_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_host_api_im_utils_IMALogApi_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_im_utils_IMALogApi_SPI_AAB_DELEGATE();
    public static final C01GW IMALogServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new C04PF());
    public static final int $stable = 8;

    private final IMALogService getIMALogServiceinstance() {
        return (IMALogService) IMALogServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMALogApi> getServices() {
        ArrayList<IMALogApi> arrayList = new ArrayList<>();
        arrayList.add(getIMALogServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMALogApi getService() {
        return getIMALogServiceinstance();
    }
}
