package com.ss.android.ugc.editorpro.components.api.text.editpanel;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.editpanel.EPTextEditPanelService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_editorpro_components_api_text_editpanel_IEPTextEditPanelService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_editorpro_components_api_text_editpanel_IEPTextEditPanelService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_editorpro_components_api_text_editpanel_IEPTextEditPanelService_SPI_AAB_DELEGATE();
    public static final C01GW EPTextEditPanelServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(716));
    public static final int $stable = 8;

    private final EPTextEditPanelService getEPTextEditPanelServiceinstance() {
        return (EPTextEditPanelService) EPTextEditPanelServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IEPTextEditPanelService> getServices() {
        ArrayList<IEPTextEditPanelService> arrayList = new ArrayList<>();
        arrayList.add(getEPTextEditPanelServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IEPTextEditPanelService getService() {
        return getEPTextEditPanelServiceinstance();
    }
}
