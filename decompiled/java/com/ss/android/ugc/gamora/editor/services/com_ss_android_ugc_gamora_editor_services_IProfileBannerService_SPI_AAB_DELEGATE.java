package com.ss.android.ugc.gamora.editor.services;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.profile.IProfileBannerServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_gamora_editor_services_IProfileBannerService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_gamora_editor_services_IProfileBannerService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_gamora_editor_services_IProfileBannerService_SPI_AAB_DELEGATE();
    public static final C01GW IProfileBannerServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(729));
    public static final int $stable = 8;

    private final IProfileBannerServiceImpl getIProfileBannerServiceImplinstance() {
        return (IProfileBannerServiceImpl) IProfileBannerServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IProfileBannerService> getServices() {
        ArrayList<IProfileBannerService> arrayList = new ArrayList<>();
        arrayList.add(getIProfileBannerServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IProfileBannerService getService() {
        return getIProfileBannerServiceImplinstance();
    }
}
