package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveGoalRewardCondition_ProtoDecoder implements C0IMD<LiveGoalRewardCondition> {
    public static LiveGoalRewardCondition LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveGoalRewardCondition liveGoalRewardCondition = new LiveGoalRewardCondition();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    liveGoalRewardCondition.topN = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveGoalRewardCondition;
            }
        }
    }

    @Override // X.C0IMD
    public final LiveGoalRewardCondition LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LiveGoalRewardCondition liveGoalRewardCondition) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveGoalRewardCondition liveGoalRewardCondition, List list) {
    }
}
