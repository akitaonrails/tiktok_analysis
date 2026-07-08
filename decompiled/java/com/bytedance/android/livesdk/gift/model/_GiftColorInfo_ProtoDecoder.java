package com.bytedance.android.livesdk.gift.model;

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
public final class _GiftColorInfo_ProtoDecoder implements C0IMD<GiftColorInfo> {
    public static GiftColorInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftColorInfo giftColorInfo = new GiftColorInfo();
        giftColorInfo.colorValues = new ArrayList();
        giftColorInfo.colorReason = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftColorInfo.colorId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 2:
                        giftColorInfo.colorName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        giftColorInfo.colorValues.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        giftColorInfo.colorImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        giftColorInfo.giftImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        giftColorInfo.colorEffectId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 7:
                        giftColorInfo.isDefault = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        giftColorInfo.colorImageSize = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        giftColorInfo.colorReason.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        giftColorInfo.colorNameEnglish = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        giftColorInfo.giftDescribe = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftColorInfo;
            }
        }
    }

    public static void LJ(GiftColorInfo giftColorInfo) {
        if (giftColorInfo.colorValues == null) {
            giftColorInfo.colorValues = new ArrayList();
        }
        ImageModel imageModel = giftColorInfo.colorImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = giftColorInfo.giftImage;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        if (giftColorInfo.colorReason == null) {
            giftColorInfo.colorReason = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftColorInfo giftColorInfo) {
        LJ(giftColorInfo);
    }

    @Override // X.C0IMD
    public final GiftColorInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftColorInfo giftColorInfo, List list) {
    }
}
