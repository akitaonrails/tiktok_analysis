package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveAuctionItem_ProtoDecoder implements C0IMD<LiveAuctionItem> {
    public static LiveAuctionItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveAuctionItem liveAuctionItem = new LiveAuctionItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        liveAuctionItem.auctionConfigId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        liveAuctionItem.auctionItemId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        liveAuctionItem.status = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        liveAuctionItem.actualStartTime = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        liveAuctionItem.actualEndTime = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        liveAuctionItem.actualFormattedStartingBidPrice = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        liveAuctionItem.numOfBids = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        liveAuctionItem.winUsername = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        liveAuctionItem.maxBiddingPrice = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        liveAuctionItem.winUserProfileImageUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        liveAuctionItem.paymentStatus = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        liveAuctionItem.paymentTime = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveAuctionItem;
            }
        }
    }

    @Override // X.C0IMD
    public final LiveAuctionItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LiveAuctionItem liveAuctionItem) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveAuctionItem liveAuctionItem, List list) {
    }
}
