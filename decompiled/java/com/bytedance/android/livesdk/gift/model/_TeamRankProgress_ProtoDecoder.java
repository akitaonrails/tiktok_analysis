package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TeamRankProgress_ProtoDecoder implements C0IMD<TeamRankProgress> {
    public static TeamRankProgress LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TeamRankProgress teamRankProgress = new TeamRankProgress();
        teamRankProgress.giftIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        teamRankProgress.currentNumber = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        teamRankProgress.targetNumber = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        teamRankProgress.giftIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    case 4:
                        teamRankProgress.timestamp = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        teamRankProgress.addScore = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        teamRankProgress.contributedScore = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return teamRankProgress;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TeamRankProgress teamRankProgress) {
        TeamRankProgress teamRankProgress2 = teamRankProgress;
        if (teamRankProgress2.giftIds == null) {
            teamRankProgress2.giftIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final TeamRankProgress LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TeamRankProgress teamRankProgress, List list) {
    }
}
