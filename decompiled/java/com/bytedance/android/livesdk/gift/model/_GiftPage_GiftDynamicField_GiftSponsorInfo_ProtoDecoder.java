package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftPage_GiftDynamicField_GiftSponsorInfo_ProtoDecoder implements C0IMD<GiftPage.GiftDynamicField.GiftSponsorInfo> {
    public static GiftPage.GiftDynamicField.GiftSponsorInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftPage.GiftDynamicField.GiftSponsorInfo giftSponsorInfo = new GiftPage.GiftDynamicField.GiftSponsorInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    giftSponsorInfo.canSponsor = C1516700pZU.LIZ(c1516680pZS);
                                }
                            } else {
                                giftSponsorInfo.leftCountToSponsor = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            giftSponsorInfo.currentCount = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        giftSponsorInfo.sponsorCount = c1516680pZS.LJIIJJI();
                    }
                } else {
                    giftSponsorInfo.sponsorId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftSponsorInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final GiftPage.GiftDynamicField.GiftSponsorInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftPage.GiftDynamicField.GiftSponsorInfo giftSponsorInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftPage.GiftDynamicField.GiftSponsorInfo giftSponsorInfo, List list) {
    }
}
