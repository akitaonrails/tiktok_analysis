package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftPage_GiftDynamicField_ProtoDecoder implements C0IMD<GiftPage.GiftDynamicField> {
    public static GiftPage.GiftDynamicField LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftPage.GiftDynamicField giftDynamicField = new GiftPage.GiftDynamicField();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftDynamicField.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        giftDynamicField.giftRankRecommendInfo = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        giftDynamicField.giftPanelBanner = _GiftPage_GiftDynamicField_GiftPanelBanner_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        giftDynamicField.canPutInGiftBox = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        giftDynamicField.giftSponsorInfo = _GiftPage_GiftDynamicField_GiftSponsorInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        giftDynamicField.isDisplayedOnPanel = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftDynamicField;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftPage.GiftDynamicField giftDynamicField) {
        GiftPage.GiftDynamicField.GiftPanelBanner giftPanelBanner = giftDynamicField.giftPanelBanner;
        if (giftPanelBanner != null) {
            _GiftPage_GiftDynamicField_GiftPanelBanner_ProtoDecoder.LJ(giftPanelBanner);
        }
    }

    @Override // X.C0IMD
    public final GiftPage.GiftDynamicField LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftPage.GiftDynamicField giftDynamicField, List list) {
    }
}
