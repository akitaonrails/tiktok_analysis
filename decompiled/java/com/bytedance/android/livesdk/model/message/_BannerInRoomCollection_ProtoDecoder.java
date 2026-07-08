package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BannerInRoomCollection_ProtoDecoder implements C0IMD<BannerInRoomCollection> {
    public static BannerInRoomCollection LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BannerInRoomCollection bannerInRoomCollection = new BannerInRoomCollection();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        bannerInRoomCollection.topRightBanner = _BannerInRoomCollection_BannerInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        bannerInRoomCollection.bottomRightBanner = _BannerInRoomCollection_BannerInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        bannerInRoomCollection.giftPanelBanner = _BannerInRoomCollection_BannerInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        bannerInRoomCollection.middleBanner = _BannerInRoomCollection_BannerInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        bannerInRoomCollection.activityTopRightBanner = _BannerInRoomCollection_BannerInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        bannerInRoomCollection.topLeft = _BannerInRoomCollection_BannerInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        bannerInRoomCollection.liveScene = _BannerInRoomCollection_BannerInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        bannerInRoomCollection.getBannerSuccess = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bannerInRoomCollection;
            }
        }
    }

    public static void LJ(BannerInRoomCollection bannerInRoomCollection) {
        BannerInRoomCollection.BannerInfo bannerInfo = bannerInRoomCollection.topRightBanner;
        if (bannerInfo != null) {
            _BannerInRoomCollection_BannerInfo_ProtoDecoder.LJ(bannerInfo);
        }
        BannerInRoomCollection.BannerInfo bannerInfo2 = bannerInRoomCollection.bottomRightBanner;
        if (bannerInfo2 != null) {
            _BannerInRoomCollection_BannerInfo_ProtoDecoder.LJ(bannerInfo2);
        }
        BannerInRoomCollection.BannerInfo bannerInfo3 = bannerInRoomCollection.giftPanelBanner;
        if (bannerInfo3 != null) {
            _BannerInRoomCollection_BannerInfo_ProtoDecoder.LJ(bannerInfo3);
        }
        BannerInRoomCollection.BannerInfo bannerInfo4 = bannerInRoomCollection.middleBanner;
        if (bannerInfo4 != null) {
            _BannerInRoomCollection_BannerInfo_ProtoDecoder.LJ(bannerInfo4);
        }
        BannerInRoomCollection.BannerInfo bannerInfo5 = bannerInRoomCollection.activityTopRightBanner;
        if (bannerInfo5 != null) {
            _BannerInRoomCollection_BannerInfo_ProtoDecoder.LJ(bannerInfo5);
        }
        BannerInRoomCollection.BannerInfo bannerInfo6 = bannerInRoomCollection.topLeft;
        if (bannerInfo6 != null) {
            _BannerInRoomCollection_BannerInfo_ProtoDecoder.LJ(bannerInfo6);
        }
        BannerInRoomCollection.BannerInfo bannerInfo7 = bannerInRoomCollection.liveScene;
        if (bannerInfo7 != null) {
            _BannerInRoomCollection_BannerInfo_ProtoDecoder.LJ(bannerInfo7);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BannerInRoomCollection bannerInRoomCollection) {
        LJ(bannerInRoomCollection);
    }

    @Override // X.C0IMD
    public final BannerInRoomCollection LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BannerInRoomCollection bannerInRoomCollection, List list) {
    }
}
