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
public final class _RandomGiftPanelBanner_ProtoDecoder implements C0IMD<RandomGiftPanelBanner> {
    public static RandomGiftPanelBanner LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RandomGiftPanelBanner randomGiftPanelBanner = new RandomGiftPanelBanner();
        randomGiftPanelBanner.bgColors = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 2:
                        randomGiftPanelBanner.shadingImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        randomGiftPanelBanner.targetNum = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        randomGiftPanelBanner.collectNum = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        randomGiftPanelBanner.displayText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        randomGiftPanelBanner.leftIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        randomGiftPanelBanner.schemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        randomGiftPanelBanner.bgColors.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        randomGiftPanelBanner.round = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        randomGiftPanelBanner.bannerPriority = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return randomGiftPanelBanner;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RandomGiftPanelBanner randomGiftPanelBanner) {
        RandomGiftPanelBanner randomGiftPanelBanner2 = randomGiftPanelBanner;
        ImageModel imageModel = randomGiftPanelBanner2.shadingImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = randomGiftPanelBanner2.leftIcon;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        if (randomGiftPanelBanner2.bgColors == null) {
            randomGiftPanelBanner2.bgColors = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final RandomGiftPanelBanner LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RandomGiftPanelBanner randomGiftPanelBanner, List list) {
    }
}
