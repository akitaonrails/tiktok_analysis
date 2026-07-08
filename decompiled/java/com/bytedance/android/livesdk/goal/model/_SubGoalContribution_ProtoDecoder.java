package com.bytedance.android.livesdk.goal.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubGoalContribution_ProtoDecoder implements C0IMD<SubGoalContribution> {
    public static SubGoalContribution LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubGoalContribution subGoalContribution = new SubGoalContribution();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        subGoalContribution.contributionCount = c1516680pZS.LJIIJJI();
                    }
                } else {
                    subGoalContribution.id = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subGoalContribution;
            }
        }
    }

    @Override // X.C0IMD
    public final SubGoalContribution LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SubGoalContribution subGoalContribution) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubGoalContribution subGoalContribution, List list) {
    }
}
