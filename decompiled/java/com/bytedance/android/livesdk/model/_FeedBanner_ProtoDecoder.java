package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _FeedBanner_ProtoDecoder implements C0IMD<FeedBanner> {
    public static FeedBanner LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FeedBanner feedBanner = new FeedBanner();
        feedBanner.urlList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        feedBanner.avgColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        feedBanner.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        feedBanner.urlList.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        feedBanner.uri = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        feedBanner.height = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        feedBanner.width = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 8:
                        feedBanner.id = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        feedBanner.schemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        feedBanner.bannerType = (int) c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        feedBanner.businessType = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        feedBanner.businessSource = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        feedBanner.activityId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        feedBanner.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        feedBanner.subtitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return feedBanner;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FeedBanner feedBanner) {
        FeedBanner feedBanner2 = feedBanner;
        if (feedBanner2.urlList == null) {
            feedBanner2.urlList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final FeedBanner LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FeedBanner feedBanner, List list) {
    }
}
