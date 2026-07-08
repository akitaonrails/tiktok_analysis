package com.ss.android.ugc.aweme.i18n.xbridge;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.jsb.idl.TemplateBridgeService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_i18n_xbridge_ITemplateBridgeService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_i18n_xbridge_ITemplateBridgeService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_i18n_xbridge_ITemplateBridgeService_SPI_AAB_DELEGATE();
    public static final C01GW TemplateBridgeServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(325));
    public static final int $stable = 8;

    private final TemplateBridgeService getTemplateBridgeServiceinstance() {
        return (TemplateBridgeService) TemplateBridgeServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<ITemplateBridgeService> getServices() {
        ArrayList<ITemplateBridgeService> arrayList = new ArrayList<>();
        arrayList.add(getTemplateBridgeServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ITemplateBridgeService getService() {
        return getTemplateBridgeServiceinstance();
    }
}
