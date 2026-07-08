package com.ss.android.ugc.aweme.im.service.aweme;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.service.impl.player.AwemeOpenHelper;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_service_aweme_IAwemeOpenHelper_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_service_aweme_IAwemeOpenHelper_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_service_aweme_IAwemeOpenHelper_SPI_AAB_DELEGATE();
    public static final C01GW Serviceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(508));

    private final AwemeOpenHelper.Service getServiceinstance() {
        return (AwemeOpenHelper.Service) Serviceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IAwemeOpenHelper> getServices() {
        ArrayList<IAwemeOpenHelper> arrayList = new ArrayList<>();
        arrayList.add(getServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IAwemeOpenHelper getService() {
        return getServiceinstance();
    }
}
