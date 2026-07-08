package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuessWidget_ProtoDecoder implements C0IMD<GuessWidget> {
    public static GuessWidget LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuessWidget guessWidget = new GuessWidget();
        guessWidget.betStats = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        guessWidget.versionId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        guessWidget.guessRound = _GuessRound_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        guessWidget.betStats.add(_BetStats_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        guessWidget.totalBetMembers = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        guessWidget.resultSubmitTimes = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        guessWidget.editResultEndtime = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guessWidget;
            }
        }
    }

    public static void LJ(GuessWidget guessWidget) {
        GuessRound guessRound = guessWidget.guessRound;
        if (guessRound != null) {
            _GuessRound_ProtoDecoder.LJ(guessRound);
        }
        List<BetStats> list = guessWidget.betStats;
        if (list == null) {
            guessWidget.betStats = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<BetStats> it2 = guessWidget.betStats.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuessWidget guessWidget) {
        LJ(guessWidget);
    }

    @Override // X.C0IMD
    public final GuessWidget LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuessWidget guessWidget, List list) {
    }
}
