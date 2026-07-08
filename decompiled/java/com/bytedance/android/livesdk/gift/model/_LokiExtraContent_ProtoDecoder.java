package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LokiExtraContent_ProtoDecoder implements C0IMD<LokiExtraContent> {
    public static LokiExtraContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LokiExtraContent lokiExtraContent = new LokiExtraContent();
        lokiExtraContent.requirements = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        lokiExtraContent.giftType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        lokiExtraContent.giftDuration = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 3:
                        lokiExtraContent.needScreenShot = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        lokiExtraContent.ismultiFrame = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        lokiExtraContent.viewOverlay = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        lokiExtraContent.befViewRenderSize = _BEFViewRenderSize_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        lokiExtraContent.befViewRenderFPS = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        lokiExtraContent.befViewFitMode = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        lokiExtraContent.modelNames = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        lokiExtraContent.requirements.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return lokiExtraContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LokiExtraContent lokiExtraContent) {
        LokiExtraContent lokiExtraContent2 = lokiExtraContent;
        if (lokiExtraContent2.requirements == null) {
            lokiExtraContent2.requirements = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final LokiExtraContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LokiExtraContent lokiExtraContent, List list) {
    }
}
