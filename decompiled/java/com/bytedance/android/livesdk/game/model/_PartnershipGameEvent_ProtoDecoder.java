package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PartnershipGameEvent_ProtoDecoder implements C0IMD<PartnershipGameEvent> {
    public static PartnershipGameEvent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PartnershipGameEvent partnershipGameEvent = new PartnershipGameEvent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        partnershipGameEvent.gameTagId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        partnershipGameEvent.anchorHasJoined = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        partnershipGameEvent.eventDetailUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        partnershipGameEvent.gameName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        partnershipGameEvent.gameIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        partnershipGameEvent.taskIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        partnershipGameEvent.eventIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        partnershipGameEvent.eventType = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        partnershipGameEvent.incentivetype = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        partnershipGameEvent.anchorHasShowed = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        partnershipGameEvent.gameIcon = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return partnershipGameEvent;
            }
        }
    }

    @Override // X.C0IMD
    public final PartnershipGameEvent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PartnershipGameEvent partnershipGameEvent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PartnershipGameEvent partnershipGameEvent, List list) {
    }
}
