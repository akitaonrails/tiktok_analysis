package com.bytedance.android.livesdk.model.message;

import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.message.GiftMessage;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftMessage_InteractiveGiftInfo_ProtoEncoder implements InterfaceC1132110fZB<GiftMessage.InteractiveGiftInfo> {
    public static void LIZIZ(C1142350fph c1142350fph, GiftMessage.InteractiveGiftInfo interactiveGiftInfo) {
        long j = interactiveGiftInfo.crossScreenDelay;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        long j2 = interactiveGiftInfo.crossScreenRole;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j2);
        int i = interactiveGiftInfo.ignoreConfig;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LIZJ(i);
        long j3 = interactiveGiftInfo.uniqId;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j3);
        long j4 = interactiveGiftInfo.toUserTeamId;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LJFF(j4);
        long j5 = interactiveGiftInfo.ignoreComponent;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJFF(j5);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftMessage.InteractiveGiftInfo interactiveGiftInfo) {
        LIZIZ(c1142350fph, interactiveGiftInfo);
    }
}
