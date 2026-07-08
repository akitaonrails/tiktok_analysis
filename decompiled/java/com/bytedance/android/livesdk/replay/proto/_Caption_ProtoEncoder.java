package com.bytedance.android.livesdk.replay.proto;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _Caption_ProtoEncoder implements InterfaceC1132110fZB<Caption> {
    public static int LIZJ(Caption caption) {
        return C1142340fpg.LJIILL(1, caption.text) + C1142340fpg.LJIIL(2, caption.startTime) + C1142340fpg.LJIIL(3, caption.duration) + C1142340fpg.LJIIIIZZ(4) + C1142340fpg.LJIIIIZZ(5);
    }

    public static void LIZIZ(C1142350fph c1142350fph, Caption caption) {
        C1142340fpg.LJFF(c1142350fph, 1, caption.text);
        long j = caption.startTime;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j);
        long j2 = caption.duration;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j2);
        C1142340fpg.LIZIZ(c1142350fph, 4, caption.centerX);
        C1142340fpg.LIZIZ(c1142350fph, 5, caption.centerY);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, Caption caption) {
        LIZIZ(c1142350fph, caption);
    }
}
