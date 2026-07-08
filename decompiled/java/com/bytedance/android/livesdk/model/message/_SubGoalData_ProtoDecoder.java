package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.gift.model._LiveStreamGoalIndicator_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._LiveStreamGoal_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubGoalData_ProtoDecoder implements C0IMD<SubGoalData> {
    public static SubGoalData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubGoalData subGoalData = new SubGoalData();
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
                                subGoalData.goalExtra = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            subGoalData.updateSource = c1516680pZS.LJIIJ();
                        }
                    } else {
                        subGoalData.goal = _LiveStreamGoal_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    subGoalData.indicator = _LiveStreamGoalIndicator_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subGoalData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SubGoalData subGoalData) {
        LiveStreamGoal liveStreamGoal = subGoalData.goal;
        if (liveStreamGoal != null) {
            _LiveStreamGoal_ProtoDecoder.LJ(liveStreamGoal);
        }
    }

    @Override // X.C0IMD
    public final SubGoalData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubGoalData subGoalData, List list) {
    }
}
