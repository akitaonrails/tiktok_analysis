package com.bytedance.android.livesdk.model.message;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;

/* JADX INFO: loaded from: classes18.dex */
public final class _PublicAreaMessageCommon_MessageDisplayInfo_ProtoEncoder implements InterfaceC1132110fZB<PublicAreaMessageCommon.MessageDisplayInfo> {
    public static int LIZJ(PublicAreaMessageCommon.MessageDisplayInfo messageDisplayInfo) {
        return C1142340fpg.LJIIIZ(1, messageDisplayInfo.durationType) + C1142340fpg.LJIIL(2, messageDisplayInfo.showDurationMs) + C1142340fpg.LJIIL(3, messageDisplayInfo.incrDurationMs) + C1142340fpg.LJIIIZ(4, messageDisplayInfo.stayStyle);
    }

    public static void LIZIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.MessageDisplayInfo messageDisplayInfo) {
        int i = messageDisplayInfo.durationType;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        long j = messageDisplayInfo.showDurationMs;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j);
        long j2 = messageDisplayInfo.incrDurationMs;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j2);
        int i2 = messageDisplayInfo.stayStyle;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LIZJ(i2);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.MessageDisplayInfo messageDisplayInfo) {
        LIZIZ(c1142350fph, messageDisplayInfo);
    }
}
