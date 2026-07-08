package com.bytedance.android.livesdk.model.message.common;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _TextFormat_ProtoEncoder implements InterfaceC1132110fZB<TextFormat> {
    public static int LIZJ(TextFormat textFormat) {
        if (textFormat == null) {
            return 0;
        }
        return C1142340fpg.LJIILL(1, textFormat.color) + C1142340fpg.LJII(2, textFormat.bold) + C1142340fpg.LJI(3) + C1142340fpg.LJIIIZ(4, textFormat.weight) + C1142340fpg.LJIIJ(5, textFormat.italicAngle) + C1142340fpg.LJIIJ(6, textFormat.fontSize) + C1142340fpg.LJII(7, textFormat.useHeighLightColor) + C1142340fpg.LJII(8, textFormat.useRemoteColor);
    }

    public static void LIZIZ(C1142350fph c1142350fph, TextFormat textFormat) {
        C1142340fpg.LJFF(c1142350fph, 1, textFormat.color);
        C1142340fpg.LIZ(c1142350fph, 2, textFormat.bold);
        boolean z = textFormat.italic;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJ(z ? 1 : 0);
        int i = textFormat.weight;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LIZJ(i);
        C1142340fpg.LIZLLL(c1142350fph, 5, textFormat.italicAngle);
        C1142340fpg.LIZLLL(c1142350fph, 6, textFormat.fontSize);
        C1142340fpg.LIZ(c1142350fph, 7, textFormat.useHeighLightColor);
        C1142340fpg.LIZ(c1142350fph, 8, textFormat.useRemoteColor);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, TextFormat textFormat) {
        LIZIZ(c1142350fph, textFormat);
    }
}
