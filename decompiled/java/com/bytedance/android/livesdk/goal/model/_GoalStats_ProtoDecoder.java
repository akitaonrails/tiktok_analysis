package com.bytedance.android.livesdk.goal.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GoalStats_ProtoDecoder implements C0IMD<GoalStats> {
    public static GoalStats LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GoalStats goalStats = new GoalStats();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                goalStats.totalNewFans = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            goalStats.comparison = _GoalComparison_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        goalStats.totalContributor = c1516680pZS.LJIIJJI();
                    }
                } else {
                    goalStats.totalCoins = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return goalStats;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GoalStats goalStats) {
    }

    @Override // X.C0IMD
    public final GoalStats LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GoalStats goalStats, List list) {
    }
}
