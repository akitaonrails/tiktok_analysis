package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BetStats_ProtoDecoder implements C0IMD<BetStats> {
    public static BetStats LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BetStats betStats = new BetStats();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        betStats.betOption = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        betStats.betPoints = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        betStats.winPoints = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        betStats.refundPoints = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        betStats.rollbackPoints = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        betStats.betTimes = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return betStats;
            }
        }
    }

    @Override // X.C0IMD
    public final BetStats LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BetStats betStats) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BetStats betStats, List list) {
    }
}
