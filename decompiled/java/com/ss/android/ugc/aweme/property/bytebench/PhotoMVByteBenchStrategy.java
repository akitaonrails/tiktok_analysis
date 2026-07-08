package com.ss.android.ugc.aweme.property.bytebench;

import X.C09GA;
import X.InterfaceC1442770neF;
import X.InterfaceC21142817oY;

/* JADX INFO: loaded from: classes23.dex */
public interface PhotoMVByteBenchStrategy extends InterfaceC1442770neF, InterfaceC21142817oY {
    @Override // X.InterfaceC1442770neF
    boolean enableMvBindingHDSwitch();

    @Override // X.InterfaceC1442770neF
    boolean enableSynthesisMvTo1080p();

    @Override // X.InterfaceC1442770neF
    int mvDynamicResolutionStrategy();

    @Override // X.InterfaceC1442770neF
    int mvFastImportStrategy();

    @Override // X.InterfaceC1442770neF
    String mvSynthesisSettingsFor1080p();

    @Override // X.InterfaceC21142817oY
    /* synthetic */ void setByteBenchStrategy(C09GA c09ga);

    /* synthetic */ void updateValue();
}
