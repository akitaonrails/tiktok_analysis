package com.bytedance.android.livesdk.model.message.common;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _TextPieceGift_ProtoEncoder implements InterfaceC1132110fZB<TextPieceGift> {
    public static int LIZJ(TextPieceGift textPieceGift) {
        int iLJIIL = C1142340fpg.LJIIL(1, textPieceGift.giftId);
        int iLIZIZ = 0;
        PatternRef patternRef = textPieceGift.nameRef;
        if (patternRef != null) {
            int iLIZJ = _PatternRef_ProtoEncoder.LIZJ(patternRef);
            iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(2);
        }
        return iLJIIL + iLIZIZ + C1142340fpg.LJIIIZ(3, textPieceGift.showType) + C1142340fpg.LJIIL(4, textPieceGift.colorId);
    }

    public static void LIZIZ(C1142350fph c1142350fph, TextPieceGift textPieceGift) {
        long j = textPieceGift.giftId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        PatternRef patternRef = textPieceGift.nameRef;
        if (patternRef != null) {
            c1142350fph.LIZLLL(2, 2);
            c1142350fph.LJ(_PatternRef_ProtoEncoder.LIZJ(patternRef));
            _PatternRef_ProtoEncoder.LIZIZ(c1142350fph, patternRef);
        }
        int i = textPieceGift.showType;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LIZJ(i);
        long j2 = textPieceGift.colorId;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j2);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, TextPieceGift textPieceGift) {
        LIZIZ(c1142350fph, textPieceGift);
    }
}
