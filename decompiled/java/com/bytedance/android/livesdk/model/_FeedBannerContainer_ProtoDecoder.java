package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FeedBannerContainer_ProtoDecoder implements C0IMD<FeedBannerContainer> {
    public static FeedBannerContainer LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FeedBannerContainer feedBannerContainer = new FeedBannerContainer();
        feedBannerContainer.bannerList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        feedBannerContainer.bannerList.add(_FeedBanner_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 2:
                        feedBannerContainer.total = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        feedBannerContainer.background = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        feedBannerContainer.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        feedBannerContainer.switchType = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        feedBannerContainer.bannersType = (int) c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return feedBannerContainer;
            }
        }
    }

    public static void LJ(FeedBannerContainer feedBannerContainer) {
        List<FeedBanner> list = feedBannerContainer.bannerList;
        if (list == null) {
            feedBannerContainer.bannerList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (FeedBanner feedBanner : feedBannerContainer.bannerList) {
                if (feedBanner != null && feedBanner.urlList == null) {
                    feedBanner.urlList = new ArrayList();
                }
            }
        }
        ImageModel imageModel = feedBannerContainer.background;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FeedBannerContainer feedBannerContainer) {
        LJ(feedBannerContainer);
    }

    @Override // X.C0IMD
    public final FeedBannerContainer LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FeedBannerContainer feedBannerContainer, List list) {
    }
}
