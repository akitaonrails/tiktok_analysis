package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.EOYBanner;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EOYBanner_ProtoDecoder implements C0IMD<EOYBanner> {
    public static EOYBanner LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EOYBanner eOYBanner = new EOYBanner();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        eOYBanner.round = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        eOYBanner.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        eOYBanner.subtitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        eOYBanner.streakInfo = _EOYBanner_StreakInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        eOYBanner.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        eOYBanner.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        eOYBanner.announcementStarlingKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        eOYBanner.description = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        eOYBanner.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        eOYBanner.gradeInfo = _EOYBanner_GradeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return eOYBanner;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EOYBanner eOYBanner) {
        EOYBanner.StreakInfo streakInfo = eOYBanner.streakInfo;
        if (streakInfo != null) {
            _EOYBanner_StreakInfo_ProtoDecoder.LJ(streakInfo);
        }
    }

    @Override // X.C0IMD
    public final EOYBanner LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EOYBanner eOYBanner, List list) {
    }
}
