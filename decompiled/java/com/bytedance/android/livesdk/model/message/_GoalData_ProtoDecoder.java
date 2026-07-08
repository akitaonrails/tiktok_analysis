package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.GoalData;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _GoalData_ProtoDecoder implements C0IMD<GoalData> {
    public static GoalData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GoalData goalData = new GoalData();
        goalData.goalProgress = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        GoalData.Progress progressLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    progressLIZLLL = _GoalData_Progress_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (lValueOf != null) {
                            if (progressLIZLLL != null) {
                                goalData.goalProgress.put(lValueOf, progressLIZLLL);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    goalData.status = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return goalData;
            }
        }
    }

    public static void LJ(GoalData goalData) {
        Map<Long, GoalData.Progress> map = goalData.goalProgress;
        if (map == null) {
            goalData.goalProgress = new HashMap();
        } else {
            if (map.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<Long, GoalData.Progress>> it2 = goalData.goalProgress.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GoalData goalData) {
        LJ(goalData);
    }

    @Override // X.C0IMD
    public final GoalData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GoalData goalData, List list) {
    }
}
