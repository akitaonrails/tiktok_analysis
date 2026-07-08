package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftGalleryBadgeInfo_ProtoDecoder implements C0IMD<GiftGalleryBadgeInfo> {
    public static GiftGalleryBadgeInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftGalleryBadgeInfo giftGalleryBadgeInfo = new GiftGalleryBadgeInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftGalleryBadgeInfo.leagueInfo = _GiftGalleryBadgeSection_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        giftGalleryBadgeInfo.galleryInfo = _GiftGalleryBadgeSection_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        giftGalleryBadgeInfo.backgroundColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        giftGalleryBadgeInfo.separatorColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        giftGalleryBadgeInfo.darkModeBackgroundColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        giftGalleryBadgeInfo.leagueName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        giftGalleryBadgeInfo.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftGalleryBadgeInfo;
            }
        }
    }

    public static void LJ(GiftGalleryBadgeInfo giftGalleryBadgeInfo) {
        GiftGalleryBadgeSection giftGalleryBadgeSection = giftGalleryBadgeInfo.leagueInfo;
        if (giftGalleryBadgeSection != null) {
            _GiftGalleryBadgeSection_ProtoDecoder.LJ(giftGalleryBadgeSection);
        }
        GiftGalleryBadgeSection giftGalleryBadgeSection2 = giftGalleryBadgeInfo.galleryInfo;
        if (giftGalleryBadgeSection2 != null) {
            _GiftGalleryBadgeSection_ProtoDecoder.LJ(giftGalleryBadgeSection2);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftGalleryBadgeInfo giftGalleryBadgeInfo) {
        LJ(giftGalleryBadgeInfo);
    }

    @Override // X.C0IMD
    public final GiftGalleryBadgeInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftGalleryBadgeInfo giftGalleryBadgeInfo, List list) {
    }
}
