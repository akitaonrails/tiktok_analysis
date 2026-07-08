package com.ss.android.ugc.aweme.im.saas.host.api.tools;

import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.tools.IMMediaPublishEventService;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_tools_IMMediaPublishEventApi_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final int $stable = 0;
    public static final com_ss_android_ugc_aweme_im_saas_host_api_tools_IMMediaPublishEventApi_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_tools_IMMediaPublishEventApi_SPI_AAB_DELEGATE();

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMMediaPublishEventApi getService() {
        return new IMMediaPublishEventService();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMMediaPublishEventApi> getServices() {
        ArrayList<IMMediaPublishEventApi> arrayList = new ArrayList<>();
        arrayList.add(new IMMediaPublishEventService());
        return arrayList;
    }
}
