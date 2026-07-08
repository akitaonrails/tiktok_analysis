package com.ss.android.ugc.aweme.property.bytebench;

import X.C09GA;
import X.InterfaceC1442780neG;
import X.InterfaceC21142817oY;

/* JADX INFO: loaded from: classes23.dex */
public interface FuncSwitchByteBenchStrategy extends InterfaceC1442780neG, InterfaceC21142817oY {
    @Override // X.InterfaceC1442780neG
    boolean enableDefaultOpenHDSwitch();

    boolean enableFastImport1080pHigher();

    boolean enableFastImport1080pLower();

    @Override // X.InterfaceC1442780neG
    boolean enableImportHD();

    @Override // X.InterfaceC1442780neG
    boolean enableRecordHD();

    @Override // X.InterfaceC21142817oY
    /* synthetic */ void setByteBenchStrategy(C09GA c09ga);

    @Override // X.InterfaceC1442780neG
    boolean showHDButton();

    /* synthetic */ void updateValue();
}
