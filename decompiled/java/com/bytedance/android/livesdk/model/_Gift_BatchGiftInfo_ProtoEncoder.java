package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _Gift_BatchGiftInfo_ProtoEncoder implements InterfaceC1132110fZB<Gift.BatchGiftInfo> {
    public static int LIZJ(Gift.BatchGiftInfo batchGiftInfo) {
        int iLJI = C1142340fpg.LJI(1);
        List<Long> list = batchGiftInfo.availableCounts;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < batchGiftInfo.availableCounts.size(); i++) {
                iLJI += C1142340fpg.LJIILIIL(2, (Long) ListProtector.get(batchGiftInfo.availableCounts, i));
            }
        }
        return iLJI;
    }

    public static void LIZIZ(C1142350fph c1142350fph, Gift.BatchGiftInfo batchGiftInfo) {
        boolean z = batchGiftInfo.canBatchSend;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJ(z ? 1 : 0);
        List<Long> list = batchGiftInfo.availableCounts;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < batchGiftInfo.availableCounts.size(); i++) {
                C1142340fpg.LJ(c1142350fph, 2, (Long) ListProtector.get(batchGiftInfo.availableCounts, i));
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, Gift.BatchGiftInfo batchGiftInfo) {
        LIZIZ(c1142350fph, batchGiftInfo);
    }
}
