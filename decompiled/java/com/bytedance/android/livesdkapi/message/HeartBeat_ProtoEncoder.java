package com.bytedance.android.livesdkapi.message;

import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes35.dex */
public final class HeartBeat_ProtoEncoder implements InterfaceC1132110fZB<HeartBeat> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, HeartBeat heartBeat) {
        HeartBeat heartBeat2 = heartBeat;
        long j = heartBeat2.roomId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        long j2 = heartBeat2.sendPacketSeqId;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j2);
    }
}
