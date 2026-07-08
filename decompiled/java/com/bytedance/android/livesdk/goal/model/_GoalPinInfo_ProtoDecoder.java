package com.bytedance.android.livesdk.goal.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GoalPinInfo_ProtoDecoder implements C0IMD<GoalPinInfo> {
    public static GoalPinInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GoalPinInfo goalPinInfo = new GoalPinInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    goalPinInfo.subGoalIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                goalPinInfo.subGoalId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            goalPinInfo.pinEndTime = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        goalPinInfo.unpin = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    goalPinInfo.pin = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return goalPinInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final GoalPinInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GoalPinInfo goalPinInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GoalPinInfo goalPinInfo, List list) {
    }
}
