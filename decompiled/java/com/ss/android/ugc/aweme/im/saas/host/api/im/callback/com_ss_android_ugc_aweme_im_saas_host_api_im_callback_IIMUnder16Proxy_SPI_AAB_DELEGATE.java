package com.ss.android.ugc.aweme.im.saas.host.api.im.callback;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.service.impl.u16.controller.IMUnder16ProxyImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_im_callback_IIMUnder16Proxy_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_host_api_im_callback_IIMUnder16Proxy_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_im_callback_IIMUnder16Proxy_SPI_AAB_DELEGATE();
    public static final C01GW IMUnder16ProxyImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(439));

    private final IMUnder16ProxyImpl getIMUnder16ProxyImplinstance() {
        return (IMUnder16ProxyImpl) IMUnder16ProxyImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IIMUnder16Proxy> getServices() {
        ArrayList<IIMUnder16Proxy> arrayList = new ArrayList<>();
        arrayList.add(getIMUnder16ProxyImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IIMUnder16Proxy getService() {
        return getIMUnder16ProxyImplinstance();
    }
}
