package com.bytedance.android.livesdk.minute_game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MinuteGameProgressTime_ProtoDecoder implements C0IMD<MinuteGameProgressTime> {
    public static MinuteGameProgressTime LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MinuteGameProgressTime minuteGameProgressTime = new MinuteGameProgressTime();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        minuteGameProgressTime.startedInSec = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        minuteGameProgressTime.rejectedInSec = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        minuteGameProgressTime.estimatedSettledInSec = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        minuteGameProgressTime.settledInSec = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        minuteGameProgressTime.estimatedFinishedInSec = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        minuteGameProgressTime.finishedInSec = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return minuteGameProgressTime;
            }
        }
    }

    @Override // X.C0IMD
    public final MinuteGameProgressTime LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MinuteGameProgressTime minuteGameProgressTime) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MinuteGameProgressTime minuteGameProgressTime, List list) {
    }
}
