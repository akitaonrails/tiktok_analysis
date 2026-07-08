package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftIconGuideInfo_ProtoDecoder implements C0IMD<GiftIconGuideInfo> {
    public static GiftIconGuideInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftIconGuideInfo giftIconGuideInfo = new GiftIconGuideInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftIconGuideInfo.guideId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        giftIconGuideInfo.scene = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        giftIconGuideInfo.text = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        giftIconGuideInfo.clickable = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        giftIconGuideInfo.clickAction = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        giftIconGuideInfo.openPageUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        giftIconGuideInfo.switchPageType = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        giftIconGuideInfo.locateGiftId = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        giftIconGuideInfo.openClientPageUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftIconGuideInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final GiftIconGuideInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftIconGuideInfo giftIconGuideInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftIconGuideInfo giftIconGuideInfo, List list) {
    }
}
