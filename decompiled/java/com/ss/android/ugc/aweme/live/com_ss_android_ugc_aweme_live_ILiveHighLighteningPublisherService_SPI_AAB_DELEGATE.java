package com.ss.android.ugc.aweme.live;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.gamora.editor.lightening.live.LiveHighLighteningPublisherService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_live_ILiveHighLighteningPublisherService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_live_ILiveHighLighteningPublisherService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_live_ILiveHighLighteningPublisherService_SPI_AAB_DELEGATE();
    public static final C01GW LiveHighLighteningPublisherServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(581));
    public static final int $stable = 8;

    private final LiveHighLighteningPublisherService getLiveHighLighteningPublisherServiceinstance() {
        return (LiveHighLighteningPublisherService) LiveHighLighteningPublisherServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<ILiveHighLighteningPublisherService> getServices() {
        ArrayList<ILiveHighLighteningPublisherService> arrayList = new ArrayList<>();
        arrayList.add(getLiveHighLighteningPublisherServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ILiveHighLighteningPublisherService getService() {
        return getLiveHighLighteningPublisherServiceinstance();
    }
}
