package com.ss.android.ugc.aweme.im.service.service;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.service.impl.IMContentService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class com_ss_android_ugc_aweme_im_service_service_IIMContentService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_service_service_IIMContentService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_service_service_IIMContentService_SPI_AAB_DELEGATE();
    public static final C01GW IMContentServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS209S0000000_21.get$arr$(278));

    private final IMContentService getIMContentServiceinstance() {
        return (IMContentService) IMContentServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IIMContentService> getServices() {
        ArrayList<IIMContentService> arrayList = new ArrayList<>();
        arrayList.add(getIMContentServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IIMContentService getService() {
        return getIMContentServiceinstance();
    }
}
