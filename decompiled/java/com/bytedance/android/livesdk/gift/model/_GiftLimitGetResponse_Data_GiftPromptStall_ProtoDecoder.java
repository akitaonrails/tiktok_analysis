package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftLimitGetResponse;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftLimitGetResponse_Data_GiftPromptStall_ProtoDecoder implements C0IMD<GiftLimitGetResponse.Data.GiftPromptStall> {
    public static GiftLimitGetResponse.Data.GiftPromptStall LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftLimitGetResponse.Data.GiftPromptStall giftPromptStall = new GiftLimitGetResponse.Data.GiftPromptStall();
        giftPromptStall.amountStalls = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftPromptStall.currencyCode = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        giftPromptStall.amountStalls.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                        break;
                    case 3:
                        giftPromptStall.selectedStall = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 4:
                        giftPromptStall.currencySymbol = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        giftPromptStall.region = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        giftPromptStall.pastMaxMoney = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 7:
                        giftPromptStall.suggestedStallThreshold = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 8:
                        giftPromptStall.selectedCode = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        giftPromptStall.coinExchangeRate = Double.longBitsToDouble(c1516680pZS.LJIIIZ());
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        giftPromptStall.useCoinLimit = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        giftPromptStall.selectedStallInCoin = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftPromptStall;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftLimitGetResponse.Data.GiftPromptStall giftPromptStall) {
        GiftLimitGetResponse.Data.GiftPromptStall giftPromptStall2 = giftPromptStall;
        if (giftPromptStall2.amountStalls == null) {
            giftPromptStall2.amountStalls = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final GiftLimitGetResponse.Data.GiftPromptStall LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftLimitGetResponse.Data.GiftPromptStall giftPromptStall, List list) {
    }
}
