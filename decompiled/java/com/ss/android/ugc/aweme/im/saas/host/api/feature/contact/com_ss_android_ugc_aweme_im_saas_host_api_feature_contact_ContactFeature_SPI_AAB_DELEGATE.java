package com.ss.android.ugc.aweme.im.saas.host.api.feature.contact;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.im.contact.IMSaasContactService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_saas_host_api_feature_contact_ContactFeature_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_saas_host_api_feature_contact_ContactFeature_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_saas_host_api_feature_contact_ContactFeature_SPI_AAB_DELEGATE();
    public static final C01GW IMSaasContactServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(409));
    public static final int $stable = 8;

    private final IMSaasContactService getIMSaasContactServiceinstance() {
        return (IMSaasContactService) IMSaasContactServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<ContactFeature> getServices() {
        ArrayList<ContactFeature> arrayList = new ArrayList<>();
        arrayList.add(getIMSaasContactServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ContactFeature getService() {
        return getIMSaasContactServiceinstance();
    }
}
