package com.ss.android.ugc.aweme.im.saas.host.api.feed;

import X.C01GW;
import X.C04PC;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.feed.IMCommonFeedBridgeService;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_feed_IMCommonFeedBridgeApi_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_host_api_feed_IMCommonFeedBridgeApi_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_feed_IMCommonFeedBridgeApi_SPI_AAB_DELEGATE();
    public static final C01GW IMCommonFeedBridgeServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new C04PC());
    public static final int $stable = 8;

    private final IMCommonFeedBridgeService getIMCommonFeedBridgeServiceinstance() {
        return (IMCommonFeedBridgeService) IMCommonFeedBridgeServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMCommonFeedBridgeApi> getServices() {
        ArrayList<IMCommonFeedBridgeApi> arrayList = new ArrayList<>();
        arrayList.add(getIMCommonFeedBridgeServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMCommonFeedBridgeApi getService() {
        return getIMCommonFeedBridgeServiceinstance();
    }
}
