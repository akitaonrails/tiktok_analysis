package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Gift;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Gift_GiftSkinToGiftTextsInfo_ProtoDecoder implements C0IMD<Gift.GiftSkinToGiftTextsInfo> {
    public static Gift.GiftSkinToGiftTextsInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Gift.GiftSkinToGiftTextsInfo giftSkinToGiftTextsInfo = new Gift.GiftSkinToGiftTextsInfo();
        giftSkinToGiftTextsInfo.giftTextIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftSkinToGiftTextsInfo.giftTextIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    giftSkinToGiftTextsInfo.giftSkinId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftSkinToGiftTextsInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Gift.GiftSkinToGiftTextsInfo giftSkinToGiftTextsInfo) {
        Gift.GiftSkinToGiftTextsInfo giftSkinToGiftTextsInfo2 = giftSkinToGiftTextsInfo;
        if (giftSkinToGiftTextsInfo2.giftTextIds == null) {
            giftSkinToGiftTextsInfo2.giftTextIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final Gift.GiftSkinToGiftTextsInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Gift.GiftSkinToGiftTextsInfo giftSkinToGiftTextsInfo, List list) {
    }
}
