package com.ss.android.ugc.aweme.im.service.service;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.service.impl.edit.EditShareSendToPanelUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_service_service_IEditShareSendToPanelUtils_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_service_service_IEditShareSendToPanelUtils_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_service_service_IEditShareSendToPanelUtils_SPI_AAB_DELEGATE();
    public static final C01GW Serviceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(523));

    private final EditShareSendToPanelUtils.Service getServiceinstance() {
        return (EditShareSendToPanelUtils.Service) Serviceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IEditShareSendToPanelUtils> getServices() {
        ArrayList<IEditShareSendToPanelUtils> arrayList = new ArrayList<>();
        arrayList.add(getServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IEditShareSendToPanelUtils getService() {
        return getServiceinstance();
    }
}
