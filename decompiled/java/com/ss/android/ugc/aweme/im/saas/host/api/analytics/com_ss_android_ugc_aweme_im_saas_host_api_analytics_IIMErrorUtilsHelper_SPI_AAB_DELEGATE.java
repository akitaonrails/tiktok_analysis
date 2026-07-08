package com.ss.android.ugc.aweme.im.saas.host.api.analytics;

import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.analytics.IMErrorUtilsHelper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_analytics_IIMErrorUtilsHelper_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final int $stable = 0;
    public static final com_ss_android_ugc_aweme_im_saas_host_api_analytics_IIMErrorUtilsHelper_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_analytics_IIMErrorUtilsHelper_SPI_AAB_DELEGATE();

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IIMErrorUtilsHelper getService() {
        return new IMErrorUtilsHelper();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IIMErrorUtilsHelper> getServices() {
        ArrayList<IIMErrorUtilsHelper> arrayList = new ArrayList<>();
        arrayList.add(new IMErrorUtilsHelper());
        return arrayList;
    }
}
