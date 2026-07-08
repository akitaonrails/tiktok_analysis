package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserFanTicket_ProtoDecoder implements C0IMD<UserFanTicket> {
    public static UserFanTicket LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserFanTicket userFanTicket = new UserFanTicket();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        userFanTicket.userId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        userFanTicket.fanTicket = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        userFanTicket.matchTotalScore = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        userFanTicket.matchRank = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        userFanTicket.countdownInfo = _UserCountdownInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        userFanTicket.playInfo = _UserPlayInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        userFanTicket.iconName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        userFanTicket.animationName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        userFanTicket.ticketUiStyle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        userFanTicket.completionProgressPercent = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        userFanTicket.topGuestRank = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        userFanTicket.ticketUiStyleV2 = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userFanTicket;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UserFanTicket userFanTicket) {
    }

    @Override // X.C0IMD
    public final UserFanTicket LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserFanTicket userFanTicket, List list) {
    }
}
