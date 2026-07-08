package com.bytedance.android.livesdk.model.message;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftIMPriority_ProtoEncoder implements InterfaceC1132110fZB<GiftIMPriority> {
    public static void LIZIZ(C1142350fph c1142350fph, GiftIMPriority giftIMPriority) {
        List<Long> list = giftIMPriority.queueSizes;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftIMPriority.queueSizes.size(); i++) {
                C1142340fpg.LJ(c1142350fph, 1, (Long) ListProtector.get(giftIMPriority.queueSizes, i));
            }
        }
        long j = giftIMPriority.selfQueuePriority;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j);
        long j2 = giftIMPriority.priority;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j2);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftIMPriority giftIMPriority) {
        LIZIZ(c1142350fph, giftIMPriority);
    }
}
