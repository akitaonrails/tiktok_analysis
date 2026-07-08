package com.ss.android.ugc.gamora.editor.services;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_gamora_editor_services_IDMCreativeEditService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_gamora_editor_services_IDMCreativeEditService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_gamora_editor_services_IDMCreativeEditService_SPI_AAB_DELEGATE();
    public static final C01GW DMCreativeEditServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(727));
    public static final int $stable = 8;

    private final DMCreativeEditServiceImpl getDMCreativeEditServiceImplinstance() {
        return (DMCreativeEditServiceImpl) DMCreativeEditServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IDMCreativeEditService> getServices() {
        ArrayList<IDMCreativeEditService> arrayList = new ArrayList<>();
        arrayList.add(getDMCreativeEditServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IDMCreativeEditService getService() {
        return getDMCreativeEditServiceImplinstance();
    }
}
