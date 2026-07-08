package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftBoxInfo_ProtoEncoder implements InterfaceC1132110fZB<GiftBoxInfo> {
    public static int LIZIZ(GiftBoxInfo giftBoxInfo) {
        return C1142340fpg.LJIIL(1, giftBoxInfo.capacity) + C1142340fpg.LJI(2) + C1142340fpg.LJIILL(3, giftBoxInfo.schemeUrl);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftBoxInfo giftBoxInfo) {
        GiftBoxInfo giftBoxInfo2 = giftBoxInfo;
        long j = giftBoxInfo2.capacity;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        boolean z = giftBoxInfo2.isPrimaryBox;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJ(z ? 1 : 0);
        C1142340fpg.LJFF(c1142350fph, 3, giftBoxInfo2.schemeUrl);
    }
}
