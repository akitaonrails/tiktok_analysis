package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _SponsorshipInfo_ProtoDecoder implements C0IMD<SponsorshipInfo> {
    public static SponsorshipInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SponsorshipInfo sponsorshipInfo = new SponsorshipInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 21) {
                    switch (iLJI) {
                        case 1:
                            sponsorshipInfo.giftId = c1516680pZS.LJIIJJI();
                            break;
                        case 2:
                            sponsorshipInfo.sponsorId = c1516680pZS.LJIIJJI();
                            break;
                        case 3:
                            sponsorshipInfo.becomeSponsor = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case 4:
                            sponsorshipInfo.lightGiftUp = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case 5:
                            sponsorshipInfo.unlightedGiftIcon = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            sponsorshipInfo.sponsorCount = c1516680pZS.LJIIJJI();
                            break;
                        case 7:
                            sponsorshipInfo.currentCount = c1516680pZS.LJIIJJI();
                            break;
                        case 8:
                            sponsorshipInfo.leftCountToSponsor = c1516680pZS.LJIIJJI();
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            sponsorshipInfo.canSponsor = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            sponsorshipInfo.giftGalleryClickSponsor = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            sponsorshipInfo.goalCount = c1516680pZS.LJIIJJI();
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            sponsorshipInfo.galleryGiftsCollectedCount = c1516680pZS.LJIIJJI();
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            sponsorshipInfo.firstTitlePageSchemeUrl = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 14:
                            sponsorshipInfo.galleryGiftsCount = c1516680pZS.LJIIJJI();
                            break;
                        case 15:
                            sponsorshipInfo.swapped = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case 16:
                            sponsorshipInfo.giftTrayStyle = c1516680pZS.LJIIJ();
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    sponsorshipInfo.becomeAllSponsored = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sponsorshipInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final SponsorshipInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SponsorshipInfo sponsorshipInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SponsorshipInfo sponsorshipInfo, List list) {
    }
}
