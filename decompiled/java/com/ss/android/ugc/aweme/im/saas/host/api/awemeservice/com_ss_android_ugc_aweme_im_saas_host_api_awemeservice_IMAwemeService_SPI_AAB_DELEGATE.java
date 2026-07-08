package com.ss.android.ugc.aweme.im.saas.host.api.awemeservice;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.awemeservice.IMAwemeServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_awemeservice_IMAwemeService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_host_api_awemeservice_IMAwemeService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_awemeservice_IMAwemeService_SPI_AAB_DELEGATE();
    public static final C01GW IMAwemeServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(394));
    public static final int $stable = 8;

    private final IMAwemeServiceImpl getIMAwemeServiceImplinstance() {
        return (IMAwemeServiceImpl) IMAwemeServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMAwemeService> getServices() {
        ArrayList<IMAwemeService> arrayList = new ArrayList<>();
        arrayList.add(getIMAwemeServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMAwemeService getService() {
        return getIMAwemeServiceImplinstance();
    }
}
