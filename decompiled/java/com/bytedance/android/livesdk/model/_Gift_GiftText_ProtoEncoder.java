package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.Gift;

/* JADX INFO: loaded from: classes18.dex */
public final class _Gift_GiftText_ProtoEncoder implements InterfaceC1132110fZB<Gift.GiftText> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, Gift.GiftText giftText) {
        Gift.GiftText giftText2 = giftText;
        long j = giftText2.giftTextId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        C1142340fpg.LJFF(c1142350fph, 2, giftText2.giftTextName);
    }
}
