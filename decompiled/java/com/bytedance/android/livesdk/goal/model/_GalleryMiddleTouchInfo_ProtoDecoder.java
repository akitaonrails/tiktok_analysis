package com.bytedance.android.livesdk.goal.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model.GalleryMiddleTouchInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GalleryMiddleTouchInfo_ProtoDecoder implements C0IMD<GalleryMiddleTouchInfo> {
    public static GalleryMiddleTouchInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GalleryMiddleTouchInfo galleryMiddleTouchInfo = new GalleryMiddleTouchInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        galleryMiddleTouchInfo.galleryLitUpGiftCount = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        galleryMiddleTouchInfo.allGalleryGiftCount = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        galleryMiddleTouchInfo.timing = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        galleryMiddleTouchInfo.singleLitUpInfo = _GalleryMiddleTouchInfo_SingleGiftLitUpInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        galleryMiddleTouchInfo.sponsorshipChangeInfo = _GalleryMiddleTouchInfo_SponsorshipChangeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        galleryMiddleTouchInfo.allGiftLitUpInfo = _GalleryMiddleTouchInfo_AllGiftLitUpInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        galleryMiddleTouchInfo.periodEndTime = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        galleryMiddleTouchInfo.galleryPeriod = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        galleryMiddleTouchInfo.region = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        galleryMiddleTouchInfo.showGalleryMidTouch = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return galleryMiddleTouchInfo;
            }
        }
    }

    public static void LJ(GalleryMiddleTouchInfo galleryMiddleTouchInfo) {
        ImageModel imageModel;
        ImageModel imageModel2;
        ImageModel imageModel3;
        ImageModel imageModel4;
        ImageModel imageModel5;
        ImageModel imageModel6;
        ImageModel imageModel7;
        GalleryMiddleTouchInfo.SingleGiftLitUpInfo singleGiftLitUpInfo = galleryMiddleTouchInfo.singleLitUpInfo;
        if (singleGiftLitUpInfo != null) {
            GalleryMiddleTouchInfo.GiftInfo giftInfo = singleGiftLitUpInfo.litUpGift;
            if (giftInfo != null && (imageModel7 = giftInfo.giftIcon) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel7);
            }
            GalleryMiddleTouchInfo.SponsorshipInfo sponsorshipInfo = singleGiftLitUpInfo.sponsorship;
            if (sponsorshipInfo != null && (imageModel6 = sponsorshipInfo.sponsorAvatar) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel6);
            }
        }
        GalleryMiddleTouchInfo.SponsorshipChangeInfo sponsorshipChangeInfo = galleryMiddleTouchInfo.sponsorshipChangeInfo;
        if (sponsorshipChangeInfo != null) {
            GalleryMiddleTouchInfo.GiftInfo giftInfo2 = sponsorshipChangeInfo.litUpGift;
            if (giftInfo2 != null && (imageModel5 = giftInfo2.giftIcon) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel5);
            }
            GalleryMiddleTouchInfo.SponsorshipInfo sponsorshipInfo2 = sponsorshipChangeInfo.previousSponsorship;
            if (sponsorshipInfo2 != null && (imageModel4 = sponsorshipInfo2.sponsorAvatar) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel4);
            }
            GalleryMiddleTouchInfo.SponsorshipInfo sponsorshipInfo3 = sponsorshipChangeInfo.currentSponsorship;
            if (sponsorshipInfo3 != null && (imageModel3 = sponsorshipInfo3.sponsorAvatar) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel3);
            }
        }
        GalleryMiddleTouchInfo.AllGiftLitUpInfo allGiftLitUpInfo = galleryMiddleTouchInfo.allGiftLitUpInfo;
        if (allGiftLitUpInfo != null) {
            GalleryMiddleTouchInfo.GiftInfo giftInfo3 = allGiftLitUpInfo.lastLitUpGift;
            if (giftInfo3 != null && (imageModel2 = giftInfo3.giftIcon) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
            GalleryMiddleTouchInfo.SponsorshipInfo sponsorshipInfo4 = allGiftLitUpInfo.lastSponsorship;
            if (sponsorshipInfo4 != null && (imageModel = sponsorshipInfo4.sponsorAvatar) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GalleryMiddleTouchInfo galleryMiddleTouchInfo) {
        LJ(galleryMiddleTouchInfo);
    }

    @Override // X.C0IMD
    public final GalleryMiddleTouchInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GalleryMiddleTouchInfo galleryMiddleTouchInfo, List list) {
    }
}
