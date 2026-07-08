package com.ss.android.ugc.aweme.im.saas.host.api.im;

import X.C01GW;
import X.C04P5;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.im.IMHostApiWebSocket;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_im_IIMHostApiWebSocket_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_host_api_im_IIMHostApiWebSocket_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_im_IIMHostApiWebSocket_SPI_AAB_DELEGATE();
    public static final C01GW IMHostApiWebSocketinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new C04P5());
    public static final int $stable = 8;

    private final IMHostApiWebSocket getIMHostApiWebSocketinstance() {
        return (IMHostApiWebSocket) IMHostApiWebSocketinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IIMHostApiWebSocket> getServices() {
        ArrayList<IIMHostApiWebSocket> arrayList = new ArrayList<>();
        arrayList.add(getIMHostApiWebSocketinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IIMHostApiWebSocket getService() {
        return getIMHostApiWebSocketinstance();
    }
}
