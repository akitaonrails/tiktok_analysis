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
public final class _UnifiedGoalData_ProtoDecoder implements C0IMD<UnifiedGoalData> {
    public static UnifiedGoalData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UnifiedGoalData unifiedGoalData = new UnifiedGoalData();
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
                                unifiedGoalData.goalExtra = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            unifiedGoalData.updateSource = c1516680pZS.LJIIJ();
                        }
                    } else {
                        unifiedGoalData.goal = _LiveStreamGoal_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    unifiedGoalData.indicator = _LiveStreamGoalIndicator_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return unifiedGoalData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UnifiedGoalData unifiedGoalData) {
        LiveStreamGoal liveStreamGoal = unifiedGoalData.goal;
        if (liveStreamGoal != null) {
            _LiveStreamGoal_ProtoDecoder.LJ(liveStreamGoal);
        }
    }

    @Override // X.C0IMD
    public final UnifiedGoalData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UnifiedGoalData unifiedGoalData, List list) {
    }
}
