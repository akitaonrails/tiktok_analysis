package com.bytedance.android.livesdk.replay.proto;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _InfoStickerConfig_ProtoEncoder implements InterfaceC1132110fZB<InfoStickerConfig> {
    public static int LIZIZ(InfoStickerConfig infoStickerConfig) {
        return C1142340fpg.LJIILL(1, infoStickerConfig.stickerId) + C1142340fpg.LJIIIIZZ(2) + C1142340fpg.LJIIIIZZ(3);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, InfoStickerConfig infoStickerConfig) {
        InfoStickerConfig infoStickerConfig2 = infoStickerConfig;
        C1142340fpg.LJFF(c1142350fph, 1, infoStickerConfig2.stickerId);
        C1142340fpg.LIZIZ(c1142350fph, 2, infoStickerConfig2.centerX);
        C1142340fpg.LIZIZ(c1142350fph, 3, infoStickerConfig2.centerY);
    }
}
