package com.ss.android.ugc.gamora.editor.services;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class com_ss_android_ugc_gamora_editor_services_IMusicEditService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_gamora_editor_services_IMusicEditService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_gamora_editor_services_IMusicEditService_SPI_AAB_DELEGATE();
    public static final C01GW MusicEditServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS210S0000000_22.get$arr$(234));
    public static final int $stable = 8;

    private final MusicEditServiceImpl getMusicEditServiceImplinstance() {
        return (MusicEditServiceImpl) MusicEditServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IMusicEditService> getServices() {
        ArrayList<IMusicEditService> arrayList = new ArrayList<>();
        arrayList.add(getMusicEditServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IMusicEditService getService() {
        return getMusicEditServiceImplinstance();
    }
}
