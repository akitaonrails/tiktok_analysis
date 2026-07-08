package com.bytedance.android.livesdkapi.message;

import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _LiveMessageSEI_ProtoEncoder implements InterfaceC1132110fZB<LiveMessageSEI> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, LiveMessageSEI liveMessageSEI) {
        LiveMessageSEI liveMessageSEI2 = liveMessageSEI;
        _LiveMessageID_ProtoEncoder.LIZIZ(c1142350fph, 1, liveMessageSEI2.uniqueID);
        long j = liveMessageSEI2.timestamp;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j);
    }
}
