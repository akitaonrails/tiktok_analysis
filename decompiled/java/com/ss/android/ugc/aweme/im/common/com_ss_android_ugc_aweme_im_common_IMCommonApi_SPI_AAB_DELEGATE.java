package com.ss.android.ugc.aweme.im.common;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_common_IMCommonApi_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_common_IMCommonApi_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_common_IMCommonApi_SPI_AAB_DELEGATE();
    public static final C01GW IMCommonImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(366));

    private final IMCommonImpl getIMCommonImplinstance() {
        return (IMCommonImpl) IMCommonImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMCommonApi> getServices() {
        ArrayList<IMCommonApi> arrayList = new ArrayList<>();
        arrayList.add(getIMCommonImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMCommonApi getService() {
        return getIMCommonImplinstance();
    }
}
