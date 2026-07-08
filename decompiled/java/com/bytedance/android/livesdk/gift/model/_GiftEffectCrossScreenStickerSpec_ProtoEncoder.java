package com.bytedance.android.livesdk.gift.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftEffectCrossScreenStickerSpec_ProtoEncoder implements InterfaceC1132110fZB<GiftEffectCrossScreenStickerSpec> {
    public static int LIZJ(GiftEffectCrossScreenStickerSpec giftEffectCrossScreenStickerSpec) {
        Map<Long, Integer> map = giftEffectCrossScreenStickerSpec.singleActionAssetIds;
        int iLIZIZ = 0;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Long, Integer> entry : giftEffectCrossScreenStickerSpec.singleActionAssetIds.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    int iLJIILIIL = C1142340fpg.LJIILIIL(1, entry.getKey()) + C1142340fpg.LJIIJ(2, entry.getValue());
                    iLIZIZ += iLJIILIIL + C1142350fph.LIZIZ(iLJIILIIL) + C1142350fph.LIZ(1);
                }
            }
        }
        Map<Long, Integer> map2 = giftEffectCrossScreenStickerSpec.actionAssetIds;
        if (map2 != null && !map2.isEmpty()) {
            for (Map.Entry<Long, Integer> entry2 : giftEffectCrossScreenStickerSpec.actionAssetIds.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null) {
                    int iLJIILIIL2 = C1142340fpg.LJIILIIL(1, entry2.getKey()) + C1142340fpg.LJIIJ(2, entry2.getValue());
                    iLIZIZ += iLJIILIIL2 + C1142350fph.LIZIZ(iLJIILIIL2) + C1142350fph.LIZ(2);
                }
            }
        }
        Map<Long, Integer> map3 = giftEffectCrossScreenStickerSpec.reactionAssetIds;
        if (map3 != null && !map3.isEmpty()) {
            for (Map.Entry<Long, Integer> entry3 : giftEffectCrossScreenStickerSpec.reactionAssetIds.entrySet()) {
                if (entry3.getKey() != null && entry3.getValue() != null) {
                    int iLJIILIIL3 = C1142340fpg.LJIILIIL(1, entry3.getKey()) + C1142340fpg.LJIIJ(2, entry3.getValue());
                    iLIZIZ += iLJIILIIL3 + C1142350fph.LIZIZ(iLJIILIIL3) + C1142350fph.LIZ(3);
                }
            }
        }
        return iLIZIZ;
    }

    public static void LIZIZ(C1142350fph c1142350fph, GiftEffectCrossScreenStickerSpec giftEffectCrossScreenStickerSpec) {
        Map<Long, Integer> map = giftEffectCrossScreenStickerSpec.singleActionAssetIds;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Long, Integer> entry : giftEffectCrossScreenStickerSpec.singleActionAssetIds.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    c1142350fph.LIZLLL(1, 2);
                    c1142350fph.LJ(C1142340fpg.LJIILIIL(1, entry.getKey()) + C1142340fpg.LJIIJ(2, entry.getValue()));
                    C1142340fpg.LJ(c1142350fph, 1, entry.getKey());
                    C1142340fpg.LIZLLL(c1142350fph, 2, entry.getValue());
                }
            }
        }
        Map<Long, Integer> map2 = giftEffectCrossScreenStickerSpec.actionAssetIds;
        if (map2 != null && !map2.isEmpty()) {
            for (Map.Entry<Long, Integer> entry2 : giftEffectCrossScreenStickerSpec.actionAssetIds.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null) {
                    c1142350fph.LIZLLL(2, 2);
                    c1142350fph.LJ(C1142340fpg.LJIILIIL(1, entry2.getKey()) + C1142340fpg.LJIIJ(2, entry2.getValue()));
                    C1142340fpg.LJ(c1142350fph, 1, entry2.getKey());
                    C1142340fpg.LIZLLL(c1142350fph, 2, entry2.getValue());
                }
            }
        }
        Map<Long, Integer> map3 = giftEffectCrossScreenStickerSpec.reactionAssetIds;
        if (map3 != null && !map3.isEmpty()) {
            for (Map.Entry<Long, Integer> entry3 : giftEffectCrossScreenStickerSpec.reactionAssetIds.entrySet()) {
                if (entry3.getKey() != null && entry3.getValue() != null) {
                    c1142350fph.LIZLLL(3, 2);
                    c1142350fph.LJ(C1142340fpg.LJIILIIL(1, entry3.getKey()) + C1142340fpg.LJIIJ(2, entry3.getValue()));
                    C1142340fpg.LJ(c1142350fph, 1, entry3.getKey());
                    C1142340fpg.LIZLLL(c1142350fph, 2, entry3.getValue());
                }
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftEffectCrossScreenStickerSpec giftEffectCrossScreenStickerSpec) {
        LIZIZ(c1142350fph, giftEffectCrossScreenStickerSpec);
    }
}
