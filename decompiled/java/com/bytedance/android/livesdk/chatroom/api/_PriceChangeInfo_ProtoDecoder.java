package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class _PriceChangeInfo_ProtoDecoder implements C0IMD<PriceChangeInfo> {
    public static PriceChangeInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PriceChangeInfo priceChangeInfo = new PriceChangeInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        priceChangeInfo.isPriceChanged = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        priceChangeInfo.newPrice = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        priceChangeInfo.oldPrice = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        priceChangeInfo.nextBillingDate = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 6:
                        priceChangeInfo.daysLeftToAgreeChange = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        priceChangeInfo.isFirstEntrance = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        priceChangeInfo.isConsentRequired = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        priceChangeInfo.contractId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        priceChangeInfo.orderId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        priceChangeInfo.noConfirmCancelContractDate = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        priceChangeInfo.billingType = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        priceChangeInfo.changedPrice = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return priceChangeInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final PriceChangeInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PriceChangeInfo priceChangeInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PriceChangeInfo priceChangeInfo, List list) {
    }
}
