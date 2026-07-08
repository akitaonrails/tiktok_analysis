package com.ss.android.ugc.aweme.im.saas.host.api.share;

import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.share.IMShareCompleteEventImpl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_share_IMShareCompleteEventApi_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final int $stable = 0;
    public static final com_ss_android_ugc_aweme_im_saas_host_api_share_IMShareCompleteEventApi_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_share_IMShareCompleteEventApi_SPI_AAB_DELEGATE();

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMShareCompleteEventApi getService() {
        return new IMShareCompleteEventImpl();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMShareCompleteEventApi> getServices() {
        ArrayList<IMShareCompleteEventApi> arrayList = new ArrayList<>();
        arrayList.add(new IMShareCompleteEventImpl());
        return arrayList;
    }
}
