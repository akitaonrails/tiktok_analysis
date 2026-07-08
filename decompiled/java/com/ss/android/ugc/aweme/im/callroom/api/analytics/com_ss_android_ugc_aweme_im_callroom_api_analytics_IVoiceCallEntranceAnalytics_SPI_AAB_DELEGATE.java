package com.ss.android.ugc.aweme.im.callroom.api.analytics;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.callroom.analytics.VoiceCallEntranceAnalyticsImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_callroom_api_analytics_IVoiceCallEntranceAnalytics_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_callroom_api_analytics_IVoiceCallEntranceAnalytics_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_callroom_api_analytics_IVoiceCallEntranceAnalytics_SPI_AAB_DELEGATE();
    public static final C01GW VoiceCallEntranceAnalyticsImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(346));
    public static final int $stable = 8;

    private final VoiceCallEntranceAnalyticsImpl getVoiceCallEntranceAnalyticsImplinstance() {
        return (VoiceCallEntranceAnalyticsImpl) VoiceCallEntranceAnalyticsImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IVoiceCallEntranceAnalytics> getServices() {
        ArrayList<IVoiceCallEntranceAnalytics> arrayList = new ArrayList<>();
        arrayList.add(getVoiceCallEntranceAnalyticsImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IVoiceCallEntranceAnalytics getService() {
        return getVoiceCallEntranceAnalyticsImplinstance();
    }
}
