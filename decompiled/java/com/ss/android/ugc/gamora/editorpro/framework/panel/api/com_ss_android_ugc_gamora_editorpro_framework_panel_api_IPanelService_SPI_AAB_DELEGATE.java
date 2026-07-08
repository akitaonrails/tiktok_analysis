package com.ss.android.ugc.gamora.editorpro.framework.panel.api;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.gamora.editorpro.framework.panel.logic.service.PanelServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_gamora_editorpro_framework_panel_api_IPanelService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_gamora_editorpro_framework_panel_api_IPanelService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_gamora_editorpro_framework_panel_api_IPanelService_SPI_AAB_DELEGATE();
    public static final C01GW PanelServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(731));
    public static final int $stable = 8;

    private final PanelServiceImpl getPanelServiceImplinstance() {
        return (PanelServiceImpl) PanelServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IPanelService> getServices() {
        ArrayList<IPanelService> arrayList = new ArrayList<>();
        arrayList.add(getPanelServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IPanelService getService() {
        return getPanelServiceImplinstance();
    }
}
