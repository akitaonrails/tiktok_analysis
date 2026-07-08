package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftsInfo_GiftGalleryInfo_ProtoDecoder implements C0IMD<GiftsInfo.GiftGalleryInfo> {
    public static GiftsInfo.GiftGalleryInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftsInfo.GiftGalleryInfo giftGalleryInfo = new GiftsInfo.GiftGalleryInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftGalleryInfo.galleryRankingLeague = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftGalleryInfo.anchorRankingLeague = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftGalleryInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final GiftsInfo.GiftGalleryInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftsInfo.GiftGalleryInfo giftGalleryInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftsInfo.GiftGalleryInfo giftGalleryInfo, List list) {
    }
}
