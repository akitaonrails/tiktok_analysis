package com.ss.android.ugc.aweme.im.saas.api.activestatus;

import X.C01GW;
import X.C1093804Po;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.activestatus.impl.IMActiveStatusImpl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_api_activestatus_IMSaasActiveStatusApi_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_api_activestatus_IMSaasActiveStatusApi_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_api_activestatus_IMSaasActiveStatusApi_SPI_AAB_DELEGATE();
    public static final C01GW IMActiveStatusImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new C1093804Po());

    private final IMActiveStatusImpl getIMActiveStatusImplinstance() {
        return (IMActiveStatusImpl) IMActiveStatusImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMSaasActiveStatusApi> getServices() {
        ArrayList<IMSaasActiveStatusApi> arrayList = new ArrayList<>();
        arrayList.add(getIMActiveStatusImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMSaasActiveStatusApi getService() {
        return getIMActiveStatusImplinstance();
    }
}
