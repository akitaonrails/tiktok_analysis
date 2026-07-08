package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PartnershipBriefDrops_ProtoDecoder implements C0IMD<PartnershipBriefDrops> {
    public static PartnershipBriefDrops LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PartnershipBriefDrops partnershipBriefDrops = new PartnershipBriefDrops();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        partnershipBriefDrops.idStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        partnershipBriefDrops.name = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        partnershipBriefDrops.icon = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        partnershipBriefDrops.gameName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        partnershipBriefDrops.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        partnershipBriefDrops.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        partnershipBriefDrops.joined = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        partnershipBriefDrops.gameIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        partnershipBriefDrops.incentivetype = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        partnershipBriefDrops.gameTagId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return partnershipBriefDrops;
            }
        }
    }

    @Override // X.C0IMD
    public final PartnershipBriefDrops LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PartnershipBriefDrops partnershipBriefDrops) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PartnershipBriefDrops partnershipBriefDrops, List list) {
    }
}
