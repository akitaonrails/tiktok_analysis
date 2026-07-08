package com.bytedance.android.livesdk.model.message;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.message.GiftMessage;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftMessage_SponsorshipInfo_ProtoEncoder implements InterfaceC1132110fZB<GiftMessage.SponsorshipInfo> {
    public static void LIZIZ(C1142350fph c1142350fph, GiftMessage.SponsorshipInfo sponsorshipInfo) {
        long j = sponsorshipInfo.giftId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        long j2 = sponsorshipInfo.sponsorId;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j2);
        boolean z = sponsorshipInfo.lightGiftUp;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJ(z ? 1 : 0);
        C1142340fpg.LJFF(c1142350fph, 4, sponsorshipInfo.unlightedGiftIcon);
        C1142340fpg.LJFF(c1142350fph, 5, sponsorshipInfo.giftGalleryDetailPageSchemeUrl);
        boolean z2 = sponsorshipInfo.giftGalleryClickSponsor;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
        int i = sponsorshipInfo.giftTrayStyle;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LIZJ(i);
        boolean z3 = sponsorshipInfo.becomeAllSponsored;
        c1142350fph.LIZLLL(21, 0);
        c1142350fph.LJ(z3 ? 1 : 0);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftMessage.SponsorshipInfo sponsorshipInfo) {
        LIZIZ(c1142350fph, sponsorshipInfo);
    }
}
