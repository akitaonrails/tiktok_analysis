package com.ss.android.ugc.aweme.services.edit;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.gamora.editor.music.batchreplace.BatchReplaceBannerServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_services_edit_IBatchReplaceBannerService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_services_edit_IBatchReplaceBannerService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_services_edit_IBatchReplaceBannerService_SPI_AAB_DELEGATE();
    public static final C01GW BatchReplaceBannerServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(642));
    public static final int $stable = 8;

    private final BatchReplaceBannerServiceImpl getBatchReplaceBannerServiceImplinstance() {
        return (BatchReplaceBannerServiceImpl) BatchReplaceBannerServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IBatchReplaceBannerService> getServices() {
        ArrayList<IBatchReplaceBannerService> arrayList = new ArrayList<>();
        arrayList.add(getBatchReplaceBannerServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IBatchReplaceBannerService getService() {
        return getBatchReplaceBannerServiceImplinstance();
    }
}
