package com.bytedance.android.livesdk.gift.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftEffectSerialSpec_ProtoEncoder implements InterfaceC1132110fZB<GiftEffectSerialSpec> {
    public static int LIZJ(GiftEffectSerialSpec giftEffectSerialSpec) {
        List<Long> list = giftEffectSerialSpec.serialAssetIds;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int iLJIILIIL = 0;
        for (int i = 0; i < giftEffectSerialSpec.serialAssetIds.size(); i++) {
            iLJIILIIL += C1142340fpg.LJIILIIL(2, (Long) ListProtector.get(giftEffectSerialSpec.serialAssetIds, i));
        }
        return iLJIILIIL;
    }

    public static void LIZIZ(C1142350fph c1142350fph, GiftEffectSerialSpec giftEffectSerialSpec) {
        List<Long> list = giftEffectSerialSpec.serialAssetIds;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftEffectSerialSpec.serialAssetIds.size(); i++) {
                C1142340fpg.LJ(c1142350fph, 2, (Long) ListProtector.get(giftEffectSerialSpec.serialAssetIds, i));
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftEffectSerialSpec giftEffectSerialSpec) {
        LIZIZ(c1142350fph, giftEffectSerialSpec);
    }
}
