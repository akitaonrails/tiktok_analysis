package com.bytedance.android.livesdk.replay.proto;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _HashtagStickerConfig_ProtoEncoder implements InterfaceC1132110fZB<HashtagStickerConfig> {
    public static int LIZIZ(HashtagStickerConfig hashtagStickerConfig) {
        return C1142340fpg.LJIILL(1, hashtagStickerConfig.text) + C1142340fpg.LJIIIIZZ(2) + C1142340fpg.LJIIIIZZ(3);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, HashtagStickerConfig hashtagStickerConfig) {
        HashtagStickerConfig hashtagStickerConfig2 = hashtagStickerConfig;
        C1142340fpg.LJFF(c1142350fph, 1, hashtagStickerConfig2.text);
        C1142340fpg.LIZIZ(c1142350fph, 2, hashtagStickerConfig2.centerX);
        C1142340fpg.LIZIZ(c1142350fph, 3, hashtagStickerConfig2.centerY);
    }
}
