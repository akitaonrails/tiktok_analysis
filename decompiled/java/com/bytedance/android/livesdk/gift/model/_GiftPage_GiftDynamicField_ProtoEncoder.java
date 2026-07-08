package com.bytedance.android.livesdk.gift.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.gift.model.GiftPage;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftPage_GiftDynamicField_ProtoEncoder implements InterfaceC1132110fZB<GiftPage.GiftDynamicField> {
    public static void LIZIZ(C1142350fph c1142350fph, GiftPage.GiftDynamicField giftDynamicField) {
        long j = giftDynamicField.id;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        C1142340fpg.LJFF(c1142350fph, 2, giftDynamicField.giftRankRecommendInfo);
        GiftPage.GiftDynamicField.GiftPanelBanner giftPanelBanner = giftDynamicField.giftPanelBanner;
        if (giftPanelBanner != null) {
            c1142350fph.LIZLLL(3, 2);
            c1142350fph.LJ(_GiftPage_GiftDynamicField_GiftPanelBanner_ProtoEncoder.LIZJ(giftPanelBanner));
            _GiftPage_GiftDynamicField_GiftPanelBanner_ProtoEncoder.LIZIZ(c1142350fph, giftPanelBanner);
        }
        boolean z = giftDynamicField.canPutInGiftBox;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJ(z ? 1 : 0);
        GiftPage.GiftDynamicField.GiftSponsorInfo giftSponsorInfo = giftDynamicField.giftSponsorInfo;
        if (giftSponsorInfo != null) {
            c1142350fph.LIZLLL(5, 2);
            c1142350fph.LJ(_GiftPage_GiftDynamicField_GiftSponsorInfo_ProtoEncoder.LIZJ(giftSponsorInfo));
            _GiftPage_GiftDynamicField_GiftSponsorInfo_ProtoEncoder.LIZIZ(c1142350fph, giftSponsorInfo);
        }
        boolean z2 = giftDynamicField.isDisplayedOnPanel;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftPage.GiftDynamicField giftDynamicField) {
        LIZIZ(c1142350fph, giftDynamicField);
    }
}
