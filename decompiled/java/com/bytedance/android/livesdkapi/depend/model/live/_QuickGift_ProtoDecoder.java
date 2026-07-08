package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuickGift_ProtoDecoder implements C0IMD<QuickGift> {
    public static QuickGift LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QuickGift quickGift = new QuickGift();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        quickGift.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        quickGift.name = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        quickGift.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        quickGift.type = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        quickGift.isBoxGift = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        quickGift.diamondCount = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        quickGift.isBroadcastGift = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        quickGift.isEffectBefview = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        quickGift.primaryEffectId = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        quickGift.greyImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return quickGift;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(QuickGift quickGift) {
        QuickGift quickGift2 = quickGift;
        ImageModel imageModel = quickGift2.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = quickGift2.greyImage;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final QuickGift LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuickGift quickGift, List list) {
    }
}
