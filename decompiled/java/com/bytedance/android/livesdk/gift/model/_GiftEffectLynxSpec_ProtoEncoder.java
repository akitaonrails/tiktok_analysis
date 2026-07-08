package com.bytedance.android.livesdk.gift.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftEffectLynxSpec_ProtoEncoder implements InterfaceC1132110fZB<GiftEffectLynxSpec> {
    public static int LIZJ(GiftEffectLynxSpec giftEffectLynxSpec) {
        List<Long> list = giftEffectLynxSpec.assetIds;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int iLJIILIIL = 0;
        for (int i = 0; i < giftEffectLynxSpec.assetIds.size(); i++) {
            iLJIILIIL += C1142340fpg.LJIILIIL(1, (Long) ListProtector.get(giftEffectLynxSpec.assetIds, i));
        }
        return iLJIILIIL;
    }

    public static void LIZIZ(C1142350fph c1142350fph, GiftEffectLynxSpec giftEffectLynxSpec) {
        List<Long> list = giftEffectLynxSpec.assetIds;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftEffectLynxSpec.assetIds.size(); i++) {
                C1142340fpg.LJ(c1142350fph, 1, (Long) ListProtector.get(giftEffectLynxSpec.assetIds, i));
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftEffectLynxSpec giftEffectLynxSpec) {
        LIZIZ(c1142350fph, giftEffectLynxSpec);
    }
}
