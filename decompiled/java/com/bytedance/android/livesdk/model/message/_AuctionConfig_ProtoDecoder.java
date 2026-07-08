package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AuctionConfig_ProtoDecoder implements C0IMD<AuctionConfig> {
    public static AuctionConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AuctionConfig auctionConfig = new AuctionConfig();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        auctionConfig.auctionConfigId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        auctionConfig.auctionConfigType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        auctionConfig.productId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        auctionConfig.skuId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        auctionConfig.productName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        auctionConfig.variantDesc = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        auctionConfig.stockNum = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        auctionConfig.auctionMode = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        auctionConfig.duration = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        auctionConfig.extendedAuctionDuration = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        auctionConfig.formattedStartingBidPrice = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        auctionConfig.numSold = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        auctionConfig.numFailed = c1516680pZS.LJIIJ();
                        break;
                    case 14:
                        auctionConfig.latestAuctionItem = _LiveAuctionItem_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        auctionConfig.productStatus = c1516680pZS.LJIIJ();
                        break;
                    case 16:
                        auctionConfig.auctionCardType = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        auctionConfig.imageUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return auctionConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AuctionConfig auctionConfig) {
    }

    @Override // X.C0IMD
    public final AuctionConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AuctionConfig auctionConfig, List list) {
    }
}
