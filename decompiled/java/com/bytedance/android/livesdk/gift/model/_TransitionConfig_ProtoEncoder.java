package com.bytedance.android.livesdk.gift.model;

import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _TransitionConfig_ProtoEncoder implements InterfaceC1132110fZB<TransitionConfig> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, TransitionConfig transitionConfig) {
        TransitionConfig transitionConfig2 = transitionConfig;
        long j = transitionConfig2.configId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, transitionConfig2.resourceImage);
    }
}
