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
public final class _GalleryMiddleTouchInfo_SponsorshipChangeInfo_ProtoDecoder implements C0IMD<GalleryMiddleTouchInfo.SponsorshipChangeInfo> {
    public static GalleryMiddleTouchInfo.SponsorshipChangeInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GalleryMiddleTouchInfo.SponsorshipChangeInfo sponsorshipChangeInfo = new GalleryMiddleTouchInfo.SponsorshipChangeInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            sponsorshipChangeInfo.currentSponsorship = _GalleryMiddleTouchInfo_SponsorshipInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        sponsorshipChangeInfo.previousSponsorship = _GalleryMiddleTouchInfo_SponsorshipInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    sponsorshipChangeInfo.litUpGift = _GalleryMiddleTouchInfo_GiftInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sponsorshipChangeInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GalleryMiddleTouchInfo.SponsorshipChangeInfo sponsorshipChangeInfo) {
        ImageModel imageModel;
        ImageModel imageModel2;
        ImageModel imageModel3;
        GalleryMiddleTouchInfo.SponsorshipChangeInfo sponsorshipChangeInfo2 = sponsorshipChangeInfo;
        GalleryMiddleTouchInfo.GiftInfo giftInfo = sponsorshipChangeInfo2.litUpGift;
        if (giftInfo != null && (imageModel3 = giftInfo.giftIcon) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        GalleryMiddleTouchInfo.SponsorshipInfo sponsorshipInfo = sponsorshipChangeInfo2.previousSponsorship;
        if (sponsorshipInfo != null && (imageModel2 = sponsorshipInfo.sponsorAvatar) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        GalleryMiddleTouchInfo.SponsorshipInfo sponsorshipInfo2 = sponsorshipChangeInfo2.currentSponsorship;
        if (sponsorshipInfo2 != null && (imageModel = sponsorshipInfo2.sponsorAvatar) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final GalleryMiddleTouchInfo.SponsorshipChangeInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GalleryMiddleTouchInfo.SponsorshipChangeInfo sponsorshipChangeInfo, List list) {
    }
}
