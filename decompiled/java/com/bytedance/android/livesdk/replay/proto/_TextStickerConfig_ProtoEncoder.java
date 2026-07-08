package com.bytedance.android.livesdk.replay.proto;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _TextStickerConfig_ProtoEncoder implements InterfaceC1132110fZB<TextStickerConfig> {
    public static int LIZJ(TextStickerConfig textStickerConfig) {
        return C1142340fpg.LJIILL(1, textStickerConfig.text) + C1142340fpg.LJIIIZ(2, textStickerConfig.textStyle) + C1142340fpg.LJIILL(3, textStickerConfig.colorHex) + C1142340fpg.LJIIIIZZ(4) + C1142340fpg.LJIIIIZZ(5) + C1142340fpg.LJIILL(6, textStickerConfig.borderColorHex) + C1142340fpg.LJIILL(7, textStickerConfig.canvasColorHex);
    }

    public static void LIZIZ(C1142350fph c1142350fph, TextStickerConfig textStickerConfig) {
        C1142340fpg.LJFF(c1142350fph, 1, textStickerConfig.text);
        int i = textStickerConfig.textStyle;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i);
        C1142340fpg.LJFF(c1142350fph, 3, textStickerConfig.colorHex);
        C1142340fpg.LIZIZ(c1142350fph, 4, textStickerConfig.centerX);
        C1142340fpg.LIZIZ(c1142350fph, 5, textStickerConfig.centerY);
        C1142340fpg.LJFF(c1142350fph, 6, textStickerConfig.borderColorHex);
        C1142340fpg.LJFF(c1142350fph, 7, textStickerConfig.canvasColorHex);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, TextStickerConfig textStickerConfig) {
        LIZIZ(c1142350fph, textStickerConfig);
    }
}
