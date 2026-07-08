package com.ss.android.ugc.aweme.im.saas.api.activestatus;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.im.activestatus.ActivityStatusConfigProducerImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_api_activestatus_IActivityStatusConfigProducer_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_api_activestatus_IActivityStatusConfigProducer_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_api_activestatus_IActivityStatusConfigProducer_SPI_AAB_DELEGATE();
    public static final C01GW ActivityStatusConfigProducerImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(390));
    public static final int $stable = 8;

    private final ActivityStatusConfigProducerImpl getActivityStatusConfigProducerImplinstance() {
        return (ActivityStatusConfigProducerImpl) ActivityStatusConfigProducerImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IActivityStatusConfigProducer> getServices() {
        ArrayList<IActivityStatusConfigProducer> arrayList = new ArrayList<>();
        arrayList.add(getActivityStatusConfigProducerImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IActivityStatusConfigProducer getService() {
        return getActivityStatusConfigProducerImplinstance();
    }
}
