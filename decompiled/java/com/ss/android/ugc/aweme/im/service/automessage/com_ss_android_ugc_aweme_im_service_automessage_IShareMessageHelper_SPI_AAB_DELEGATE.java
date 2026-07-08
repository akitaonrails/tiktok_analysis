package com.ss.android.ugc.aweme.im.service.automessage;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.service.impl.share.ShareMessageHelper;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_service_automessage_IShareMessageHelper_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_service_automessage_IShareMessageHelper_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_service_automessage_IShareMessageHelper_SPI_AAB_DELEGATE();
    public static final C01GW Serviceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(506));

    private final ShareMessageHelper.Service getServiceinstance() {
        return (ShareMessageHelper.Service) Serviceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IShareMessageHelper> getServices() {
        ArrayList<IShareMessageHelper> arrayList = new ArrayList<>();
        arrayList.add(getServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IShareMessageHelper getService() {
        return getServiceinstance();
    }
}
