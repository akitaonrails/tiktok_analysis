package com.ss.android.ugc.aweme.im.service.service;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.service.impl.IMCommonGuideSheetServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_service_service_IMCommonGuideSheetService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_service_service_IMCommonGuideSheetService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_service_service_IMCommonGuideSheetService_SPI_AAB_DELEGATE();
    public static final C01GW IMCommonGuideSheetServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(533));

    private final IMCommonGuideSheetServiceImpl getIMCommonGuideSheetServiceImplinstance() {
        return (IMCommonGuideSheetServiceImpl) IMCommonGuideSheetServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMCommonGuideSheetService> getServices() {
        ArrayList<IMCommonGuideSheetService> arrayList = new ArrayList<>();
        arrayList.add(getIMCommonGuideSheetServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMCommonGuideSheetService getService() {
        return getIMCommonGuideSheetServiceImplinstance();
    }
}
