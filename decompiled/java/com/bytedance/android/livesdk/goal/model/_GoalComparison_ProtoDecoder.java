package com.bytedance.android.livesdk.goal.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GoalComparison_ProtoDecoder implements C0IMD<GoalComparison> {
    public static GoalComparison LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GoalComparison goalComparison = new GoalComparison();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        goalComparison.contributorIncr = c1516680pZS.LJIIJJI();
                    }
                } else {
                    goalComparison.coinsIncr = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return goalComparison;
            }
        }
    }

    @Override // X.C0IMD
    public final GoalComparison LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GoalComparison goalComparison) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GoalComparison goalComparison, List list) {
    }
}
