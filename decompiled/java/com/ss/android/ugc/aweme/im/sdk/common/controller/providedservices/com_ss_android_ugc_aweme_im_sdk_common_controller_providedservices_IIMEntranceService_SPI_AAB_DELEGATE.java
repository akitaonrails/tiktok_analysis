package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.di.ImEntranceService;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_sdk_common_controller_providedservices_IIMEntranceService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_sdk_common_controller_providedservices_IIMEntranceService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_sdk_common_controller_providedservices_IIMEntranceService_SPI_AAB_DELEGATE();
    public static final C01GW ImEntranceServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(498));

    private final ImEntranceService getImEntranceServiceinstance() {
        return (ImEntranceService) ImEntranceServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IIMEntranceService> getServices() {
        ArrayList<IIMEntranceService> arrayList = new ArrayList<>();
        arrayList.add(getImEntranceServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IIMEntranceService getService() {
        return getImEntranceServiceinstance();
    }
}
