package com.bytedance.android.livesdk.gift.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _LynxGiftExtra_ProtoEncoder implements InterfaceC1132110fZB<LynxGiftExtra> {
    public static void LIZIZ(C1142350fph c1142350fph, LynxGiftExtra lynxGiftExtra) {
        long j = lynxGiftExtra.id;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        long j2 = lynxGiftExtra.code;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j2);
        long j3 = lynxGiftExtra.type;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j3);
        List<String> list = lynxGiftExtra.params;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < lynxGiftExtra.params.size(); i++) {
                C1142340fpg.LJFF(c1142350fph, 4, (String) ListProtector.get(lynxGiftExtra.params, i));
            }
        }
        C1142340fpg.LJFF(c1142350fph, 5, lynxGiftExtra.extra);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, LynxGiftExtra lynxGiftExtra) {
        LIZIZ(c1142350fph, lynxGiftExtra);
    }
}
