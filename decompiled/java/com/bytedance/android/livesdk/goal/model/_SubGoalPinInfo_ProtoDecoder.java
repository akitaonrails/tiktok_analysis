package com.bytedance.android.livesdk.goal.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubGoalPinInfo_ProtoDecoder implements C0IMD<SubGoalPinInfo> {
    public static SubGoalPinInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubGoalPinInfo subGoalPinInfo = new SubGoalPinInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            subGoalPinInfo.pinReadyTime = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        subGoalPinInfo.pinEndTime = c1516680pZS.LJIIJJI();
                    }
                } else {
                    subGoalPinInfo.pinStartTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subGoalPinInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final SubGoalPinInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SubGoalPinInfo subGoalPinInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubGoalPinInfo subGoalPinInfo, List list) {
    }
}
