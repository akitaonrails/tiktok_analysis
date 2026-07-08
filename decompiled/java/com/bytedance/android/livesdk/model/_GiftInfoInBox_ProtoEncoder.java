package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.gift.assets._AssetsModel_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftInfoInBox_ProtoEncoder implements InterfaceC1132110fZB<GiftInfoInBox> {
    public static int LIZJ(GiftInfoInBox giftInfoInBox) {
        return C1142340fpg.LJIIL(1, giftInfoInBox.giftId) + C1142340fpg.LJIIL(2, giftInfoInBox.effectId) + C1142340fpg.LJIIL(3, giftInfoInBox.colorId) + C1142340fpg.LJIIIZ(4, giftInfoInBox.remainTimes) + _AssetsModel_ProtoEncoder.LJ(5, giftInfoInBox.asset);
    }

    public static void LIZIZ(C1142350fph c1142350fph, GiftInfoInBox giftInfoInBox) {
        long j = giftInfoInBox.giftId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        long j2 = giftInfoInBox.effectId;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j2);
        long j3 = giftInfoInBox.colorId;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j3);
        int i = giftInfoInBox.remainTimes;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LIZJ(i);
        _AssetsModel_ProtoEncoder.LIZJ(c1142350fph, 5, giftInfoInBox.asset);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftInfoInBox giftInfoInBox) {
        LIZIZ(c1142350fph, giftInfoInBox);
    }
}
