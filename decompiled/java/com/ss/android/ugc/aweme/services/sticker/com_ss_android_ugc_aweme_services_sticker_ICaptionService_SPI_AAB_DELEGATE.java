package com.ss.android.ugc.aweme.services.sticker;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.shortvideo.subtitle.CaptionServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_services_sticker_ICaptionService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_services_sticker_ICaptionService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_services_sticker_ICaptionService_SPI_AAB_DELEGATE();
    public static final C01GW CaptionServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(648));
    public static final int $stable = 8;

    private final CaptionServiceImpl getCaptionServiceImplinstance() {
        return (CaptionServiceImpl) CaptionServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<ICaptionService> getServices() {
        ArrayList<ICaptionService> arrayList = new ArrayList<>();
        arrayList.add(getCaptionServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ICaptionService getService() {
        return getCaptionServiceImplinstance();
    }
}
