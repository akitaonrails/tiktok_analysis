package com.ss.android.ugc.aweme.autocut;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.shortvideo.autocut.AutoCutGeckoChannelServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_autocut_IAutoCutGeckoChannelService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_autocut_IAutoCutGeckoChannelService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_autocut_IAutoCutGeckoChannelService_SPI_AAB_DELEGATE();
    public static final C01GW AutoCutGeckoChannelServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(189));
    public static final int $stable = 8;

    private final AutoCutGeckoChannelServiceImpl getAutoCutGeckoChannelServiceImplinstance() {
        return (AutoCutGeckoChannelServiceImpl) AutoCutGeckoChannelServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IAutoCutGeckoChannelService> getServices() {
        ArrayList<IAutoCutGeckoChannelService> arrayList = new ArrayList<>();
        arrayList.add(getAutoCutGeckoChannelServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IAutoCutGeckoChannelService getService() {
        return getAutoCutGeckoChannelServiceImplinstance();
    }
}
