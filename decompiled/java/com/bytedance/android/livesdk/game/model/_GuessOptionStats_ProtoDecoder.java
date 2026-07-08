package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuessOptionStats_ProtoDecoder implements C0IMD<GuessOptionStats> {
    public static GuessOptionStats LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuessOptionStats guessOptionStats = new GuessOptionStats();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            guessOptionStats.bonusOdds = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        }
                    } else {
                        guessOptionStats.pointsNum = c1516680pZS.LJIIJJI();
                    }
                } else {
                    guessOptionStats.memberNum = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guessOptionStats;
            }
        }
    }

    @Override // X.C0IMD
    public final GuessOptionStats LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GuessOptionStats guessOptionStats) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuessOptionStats guessOptionStats, List list) {
    }
}
