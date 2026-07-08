package com.bytedance.android.livesdk.goal.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model.GalleryMiddleTouchInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GalleryMiddleTouchInfo_AllGiftLitUpInfo_ProtoDecoder implements C0IMD<GalleryMiddleTouchInfo.AllGiftLitUpInfo> {
    public static GalleryMiddleTouchInfo.AllGiftLitUpInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GalleryMiddleTouchInfo.AllGiftLitUpInfo allGiftLitUpInfo = new GalleryMiddleTouchInfo.AllGiftLitUpInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        allGiftLitUpInfo.lastSponsorship = _GalleryMiddleTouchInfo_SponsorshipInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    allGiftLitUpInfo.lastLitUpGift = _GalleryMiddleTouchInfo_GiftInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return allGiftLitUpInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GalleryMiddleTouchInfo.AllGiftLitUpInfo allGiftLitUpInfo) {
        ImageModel imageModel;
        ImageModel imageModel2;
        GalleryMiddleTouchInfo.AllGiftLitUpInfo allGiftLitUpInfo2 = allGiftLitUpInfo;
        GalleryMiddleTouchInfo.GiftInfo giftInfo = allGiftLitUpInfo2.lastLitUpGift;
        if (giftInfo != null && (imageModel2 = giftInfo.giftIcon) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        GalleryMiddleTouchInfo.SponsorshipInfo sponsorshipInfo = allGiftLitUpInfo2.lastSponsorship;
        if (sponsorshipInfo != null && (imageModel = sponsorshipInfo.sponsorAvatar) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final GalleryMiddleTouchInfo.AllGiftLitUpInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GalleryMiddleTouchInfo.AllGiftLitUpInfo allGiftLitUpInfo, List list) {
    }
}
