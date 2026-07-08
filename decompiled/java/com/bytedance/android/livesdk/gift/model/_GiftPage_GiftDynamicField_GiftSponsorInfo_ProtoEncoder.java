package com.bytedance.android.livesdk.gift.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.gift.model.GiftPage;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftPage_GiftDynamicField_GiftSponsorInfo_ProtoEncoder implements InterfaceC1132110fZB<GiftPage.GiftDynamicField.GiftSponsorInfo> {
    public static int LIZJ(GiftPage.GiftDynamicField.GiftSponsorInfo giftSponsorInfo) {
        return C1142340fpg.LJIIL(1, giftSponsorInfo.sponsorId) + C1142340fpg.LJIIL(2, giftSponsorInfo.sponsorCount) + C1142340fpg.LJIIL(3, giftSponsorInfo.currentCount) + C1142340fpg.LJIIL(4, giftSponsorInfo.leftCountToSponsor) + C1142340fpg.LJI(5);
    }

    public static void LIZIZ(C1142350fph c1142350fph, GiftPage.GiftDynamicField.GiftSponsorInfo giftSponsorInfo) {
        long j = giftSponsorInfo.sponsorId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        long j2 = giftSponsorInfo.sponsorCount;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j2);
        long j3 = giftSponsorInfo.currentCount;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j3);
        long j4 = giftSponsorInfo.leftCountToSponsor;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j4);
        boolean z = giftSponsorInfo.canSponsor;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LJ(z ? 1 : 0);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftPage.GiftDynamicField.GiftSponsorInfo giftSponsorInfo) {
        LIZIZ(c1142350fph, giftSponsorInfo);
    }
}
