package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AuctionItem_ProtoDecoder implements C0IMD<AuctionItem> {
    public static AuctionItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AuctionItem auctionItem = new AuctionItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        auctionItem.auctionItemId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        auctionItem.status = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        auctionItem.actualEndTime = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        auctionItem.numOfBids = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        auctionItem.winUsername = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        auctionItem.maxBiddingPrice = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        auctionItem.formattedMaxBiddingPrice = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        auctionItem.winUserProfileImageUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        auctionItem.expectedEndTimeMs = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        auctionItem.paymentStatus = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return auctionItem;
            }
        }
    }

    @Override // X.C0IMD
    public final AuctionItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AuctionItem auctionItem) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AuctionItem auctionItem, List list) {
    }
}
