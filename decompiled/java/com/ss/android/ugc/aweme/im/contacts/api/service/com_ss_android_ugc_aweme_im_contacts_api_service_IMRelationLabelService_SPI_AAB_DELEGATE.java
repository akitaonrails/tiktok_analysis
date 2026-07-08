package com.ss.android.ugc.aweme.im.contacts.api.service;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.service.impl.relationlabel.IMRelationLabelServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_contacts_api_service_IMRelationLabelService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_contacts_api_service_IMRelationLabelService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_contacts_api_service_IMRelationLabelService_SPI_AAB_DELEGATE();
    public static final C01GW IMRelationLabelServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(373));

    private final IMRelationLabelServiceImpl getIMRelationLabelServiceImplinstance() {
        return (IMRelationLabelServiceImpl) IMRelationLabelServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMRelationLabelService> getServices() {
        ArrayList<IMRelationLabelService> arrayList = new ArrayList<>();
        arrayList.add(getIMRelationLabelServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMRelationLabelService getService() {
        return getIMRelationLabelServiceImplinstance();
    }
}
