package com.bytedance.android.livesdkapi.message;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _LiveMessageID_ProtoEncoder implements InterfaceC1132110fZB<LiveMessageID> {
    public static int LIZJ(int i, LiveMessageID liveMessageID) {
        if (liveMessageID == null) {
            return 0;
        }
        int iLJIILL = C1142340fpg.LJIILL(1, liveMessageID.primaryID) + C1142340fpg.LJIILL(2, liveMessageID.messageScene);
        return iLJIILL + C1142350fph.LIZIZ(iLJIILL) + C1142350fph.LIZ(i);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, LiveMessageID liveMessageID) {
        LiveMessageID liveMessageID2 = liveMessageID;
        C1142340fpg.LJFF(c1142350fph, 1, liveMessageID2.primaryID);
        C1142340fpg.LJFF(c1142350fph, 2, liveMessageID2.messageScene);
    }

    public static void LIZIZ(C1142350fph c1142350fph, int i, LiveMessageID liveMessageID) {
        if (liveMessageID == null) {
            return;
        }
        c1142350fph.LIZLLL(i, 2);
        c1142350fph.LJ(C1142340fpg.LJIILL(1, liveMessageID.primaryID) + C1142340fpg.LJIILL(2, liveMessageID.messageScene));
        C1142340fpg.LJFF(c1142350fph, 1, liveMessageID.primaryID);
        C1142340fpg.LJFF(c1142350fph, 2, liveMessageID.messageScene);
    }
}
