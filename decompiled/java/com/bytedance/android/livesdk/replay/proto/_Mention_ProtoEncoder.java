package com.bytedance.android.livesdk.replay.proto;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _Mention_ProtoEncoder implements InterfaceC1132110fZB<Mention> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, Mention mention) {
        Mention mention2 = mention;
        C1142340fpg.LJFF(c1142350fph, 1, mention2.userId);
        C1142340fpg.LJFF(c1142350fph, 2, mention2.nickname);
    }
}
