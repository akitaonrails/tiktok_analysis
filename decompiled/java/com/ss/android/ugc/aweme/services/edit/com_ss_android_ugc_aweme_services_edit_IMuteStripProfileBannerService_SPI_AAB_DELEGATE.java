package com.ss.android.ugc.aweme.services.edit;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.gamora.editor.music.mutestrip.MuteStripProfileBannerServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_services_edit_IMuteStripProfileBannerService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_services_edit_IMuteStripProfileBannerService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_services_edit_IMuteStripProfileBannerService_SPI_AAB_DELEGATE();
    public static final C01GW MuteStripProfileBannerServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(645));
    public static final int $stable = 8;

    private final MuteStripProfileBannerServiceImpl getMuteStripProfileBannerServiceImplinstance() {
        return (MuteStripProfileBannerServiceImpl) MuteStripProfileBannerServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMuteStripProfileBannerService> getServices() {
        ArrayList<IMuteStripProfileBannerService> arrayList = new ArrayList<>();
        arrayList.add(getMuteStripProfileBannerServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMuteStripProfileBannerService getService() {
        return getMuteStripProfileBannerServiceImplinstance();
    }
}
