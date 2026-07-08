package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveStreamGoalIndicator_ProtoDecoder implements C0IMD<LiveStreamGoalIndicator> {
    public static LiveStreamGoalIndicator LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveStreamGoalIndicator liveStreamGoalIndicator = new LiveStreamGoalIndicator();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        liveStreamGoalIndicator.op = c1516680pZS.LJIIJ();
                    }
                } else {
                    liveStreamGoalIndicator.key = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveStreamGoalIndicator;
            }
        }
    }

    @Override // X.C0IMD
    public final LiveStreamGoalIndicator LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LiveStreamGoalIndicator liveStreamGoalIndicator) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveStreamGoalIndicator liveStreamGoalIndicator, List list) {
    }
}
