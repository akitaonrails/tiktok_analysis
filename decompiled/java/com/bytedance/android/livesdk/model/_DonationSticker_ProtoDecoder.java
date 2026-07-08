package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DonationSticker_ProtoDecoder implements C0IMD<DonationSticker> {
    public static DonationSticker LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        DonationSticker donationSticker = new DonationSticker();
        donationSticker.inputRect = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        donationSticker.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        donationSticker.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        donationSticker.type = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        donationSticker.inputRect.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    case 5:
                        donationSticker.textSize = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        donationSticker.textColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        donationSticker.content = _OrganizationModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        donationSticker.maxLength = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        donationSticker.status = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        donationSticker.screenHeight = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        donationSticker.x = (int) c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        donationSticker.screenWidth = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        donationSticker.y = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 14:
                        donationSticker.kind = c1516680pZS.LJIIJJI();
                        break;
                    case 15:
                        donationSticker.subType = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return donationSticker;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(DonationSticker donationSticker) {
        ImageModel imageModel;
        DonationSticker donationSticker2 = donationSticker;
        ImageModel imageModel2 = donationSticker2.image;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        if (donationSticker2.inputRect == null) {
            donationSticker2.inputRect = new ArrayList();
        }
        OrganizationModel organizationModel = donationSticker2.content;
        if (organizationModel != null && (imageModel = organizationModel.icon) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final DonationSticker LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DonationSticker donationSticker, List list) {
    }
}
