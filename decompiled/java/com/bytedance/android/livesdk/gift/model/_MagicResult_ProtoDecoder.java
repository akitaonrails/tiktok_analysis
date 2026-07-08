package com.bytedance.android.livesdk.gift.model;

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
public final class _MagicResult_ProtoDecoder implements C0IMD<MagicResult> {
    public static MagicResult LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MagicResult magicResult = new MagicResult();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        magicResult.magicResultId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        magicResult.magicOptionId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        magicResult.giftPrice = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        magicResult.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        magicResult.magicGiftId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        magicResult.magicGiftName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        magicResult.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        magicResult.isContrast = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        magicResult.character = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        magicResult.landmark = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        magicResult.element = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        magicResult.level = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return magicResult;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MagicResult magicResult) {
        ImageModel imageModel = magicResult.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final MagicResult LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MagicResult magicResult, List list) {
    }
}
