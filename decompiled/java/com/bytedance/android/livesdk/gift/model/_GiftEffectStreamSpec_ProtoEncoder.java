package com.bytedance.android.livesdk.gift.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftEffectStreamSpec_ProtoEncoder implements InterfaceC1132110fZB<GiftEffectStreamSpec> {
    public static int LIZJ(GiftEffectStreamSpec giftEffectStreamSpec) {
        if (giftEffectStreamSpec == null) {
            return 0;
        }
        int iLJIIL = C1142340fpg.LJIIL(1, giftEffectStreamSpec.basicAssetId);
        List<Long> list = giftEffectStreamSpec.extraAssetIds;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftEffectStreamSpec.extraAssetIds.size(); i++) {
                iLJIIL += C1142340fpg.LJIILIIL(2, (Long) ListProtector.get(giftEffectStreamSpec.extraAssetIds, i));
            }
        }
        return iLJIIL;
    }

    public static void LIZIZ(C1142350fph c1142350fph, GiftEffectStreamSpec giftEffectStreamSpec) {
        long j = giftEffectStreamSpec.basicAssetId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        List<Long> list = giftEffectStreamSpec.extraAssetIds;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftEffectStreamSpec.extraAssetIds.size(); i++) {
                C1142340fpg.LJ(c1142350fph, 2, (Long) ListProtector.get(giftEffectStreamSpec.extraAssetIds, i));
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftEffectStreamSpec giftEffectStreamSpec) {
        LIZIZ(c1142350fph, giftEffectStreamSpec);
    }
}
