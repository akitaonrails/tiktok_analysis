package com.ss.android.ugc.aweme.refine;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_refine_ICreativeRefineService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_refine_ICreativeRefineService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_refine_ICreativeRefineService_SPI_AAB_DELEGATE();
    public static final C01GW CreativeRefineServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(612));
    public static final int $stable = 8;

    private final CreativeRefineService getCreativeRefineServiceinstance() {
        return (CreativeRefineService) CreativeRefineServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<ICreativeRefineService> getServices() {
        ArrayList<ICreativeRefineService> arrayList = new ArrayList<>();
        arrayList.add(getCreativeRefineServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ICreativeRefineService getService() {
        return getCreativeRefineServiceinstance();
    }
}
