package com.bytedance.android.livesdk.rank.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TeamRankBonusTime_ProtoDecoder implements C0IMD<TeamRankBonusTime> {
    public static TeamRankBonusTime LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TeamRankBonusTime teamRankBonusTime = new TeamRankBonusTime();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 2) {
                    if (iLJI != 3) {
                        if (iLJI != 4) {
                            if (iLJI != 5) {
                                if (iLJI != 6) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    teamRankBonusTime.bonusTimeGiftId = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                teamRankBonusTime.bonusRate = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            teamRankBonusTime.showAnimation = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        teamRankBonusTime.endTimestamp = c1516680pZS.LJIIJJI();
                    }
                } else {
                    teamRankBonusTime.startTimestamp = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return teamRankBonusTime;
            }
        }
    }

    @Override // X.C0IMD
    public final TeamRankBonusTime LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TeamRankBonusTime teamRankBonusTime) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TeamRankBonusTime teamRankBonusTime, List list) {
    }
}
