package com.ss.android.ugc.aweme.im.service;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.service.provider.IMService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class com_ss_android_ugc_aweme_im_service_IIMService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_service_IIMService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_service_IIMService_SPI_AAB_DELEGATE();
    public static final C01GW IMServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS221S0000000_31.get$arr$(210));

    private final IMService getIMServiceinstance() {
        return (IMService) IMServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IIMService> getServices() {
        ArrayList<IIMService> arrayList = new ArrayList<>();
        arrayList.add(getIMServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IIMService getService() {
        return getIMServiceinstance();
    }
}
