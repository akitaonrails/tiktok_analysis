package com.bytedance.android.livesdk.gift.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftEffectPrefabSpec_ProtoEncoder implements InterfaceC1132110fZB<GiftEffectPrefabSpec> {
    public static int LIZJ(GiftEffectPrefabSpec giftEffectPrefabSpec) {
        int iLJIIL = C1142340fpg.LJIIL(1, giftEffectPrefabSpec.templateAssetId);
        List<Long> list = giftEffectPrefabSpec.prefabAssetIds;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftEffectPrefabSpec.prefabAssetIds.size(); i++) {
                iLJIIL += C1142340fpg.LJIILIIL(2, (Long) ListProtector.get(giftEffectPrefabSpec.prefabAssetIds, i));
            }
        }
        return iLJIIL;
    }

    public static void LIZIZ(C1142350fph c1142350fph, GiftEffectPrefabSpec giftEffectPrefabSpec) {
        long j = giftEffectPrefabSpec.templateAssetId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        List<Long> list = giftEffectPrefabSpec.prefabAssetIds;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftEffectPrefabSpec.prefabAssetIds.size(); i++) {
                C1142340fpg.LJ(c1142350fph, 2, (Long) ListProtector.get(giftEffectPrefabSpec.prefabAssetIds, i));
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftEffectPrefabSpec giftEffectPrefabSpec) {
        LIZIZ(c1142350fph, giftEffectPrefabSpec);
    }
}
