package com.bytedance.android.livesdk.goal.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GoalReward_ProtoDecoder implements C0IMD<GoalReward> {
    public static GoalReward LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GoalReward goalReward = new GoalReward();
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
                                goalReward.auditStatus = c1516680pZS.LJIIJ();
                            }
                        } else {
                            goalReward.hasSticker = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        goalReward.topN = c1516680pZS.LJIIJ();
                    }
                } else {
                    goalReward.rewardContent = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return goalReward;
            }
        }
    }

    @Override // X.C0IMD
    public final GoalReward LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GoalReward goalReward) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GoalReward goalReward, List list) {
    }
}
