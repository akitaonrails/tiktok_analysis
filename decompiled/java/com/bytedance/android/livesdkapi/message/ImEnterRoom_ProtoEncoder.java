package com.bytedance.android.livesdkapi.message;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes35.dex */
public final class ImEnterRoom_ProtoEncoder implements InterfaceC1132110fZB<ImEnterRoom> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, ImEnterRoom imEnterRoom) {
        ImEnterRoom imEnterRoom2 = imEnterRoom;
        long j = imEnterRoom2.roomId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        C1142340fpg.LJFF(c1142350fph, 2, imEnterRoom2.roomTag);
        C1142340fpg.LJFF(c1142350fph, 3, imEnterRoom2.liveRegion);
        long j2 = imEnterRoom2.liveId;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j2);
        C1142340fpg.LJFF(c1142350fph, 5, imEnterRoom2.identity);
        C1142340fpg.LJFF(c1142350fph, 6, imEnterRoom2.cursor);
        long j3 = imEnterRoom2.accountType;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LJFF(j3);
        long j4 = imEnterRoom2.enterUniqueId;
        c1142350fph.LIZLLL(8, 0);
        c1142350fph.LJFF(j4);
        C1142340fpg.LJFF(c1142350fph, 9, imEnterRoom2.filterWelcomeMsg);
        boolean z = imEnterRoom2.isAnchorContinueKeepMsg;
        c1142350fph.LIZLLL(10, 0);
        c1142350fph.LJ(z ? 1 : 0);
    }
}
