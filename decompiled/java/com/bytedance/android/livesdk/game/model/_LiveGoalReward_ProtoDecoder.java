package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoalContributor;
import com.bytedance.android.livesdk.gift.model._LiveStreamGoalContributor_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveGoalReward_ProtoDecoder implements C0IMD<LiveGoalReward> {
    public static LiveGoalReward LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveGoalReward liveGoalReward = new LiveGoalReward();
        liveGoalReward.rewardUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        liveGoalReward.goalId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        liveGoalReward.rewardContent = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        liveGoalReward.condition = _LiveGoalRewardCondition_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        liveGoalReward.auditStatus = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        liveGoalReward.rewardUsers.add(_LiveStreamGoalContributor_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        liveGoalReward.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        liveGoalReward.endTime = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveGoalReward;
            }
        }
    }

    public static void LJ(LiveGoalReward liveGoalReward) {
        List<LiveStreamGoalContributor> list = liveGoalReward.rewardUsers;
        if (list == null) {
            liveGoalReward.rewardUsers = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (LiveStreamGoalContributor liveStreamGoalContributor : liveGoalReward.rewardUsers) {
            if (liveStreamGoalContributor != null) {
                _LiveStreamGoalContributor_ProtoDecoder.LJ(liveStreamGoalContributor);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveGoalReward liveGoalReward) {
        LJ(liveGoalReward);
    }

    @Override // X.C0IMD
    public final LiveGoalReward LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveGoalReward liveGoalReward, List list) {
    }
}
