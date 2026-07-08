package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuessWidgets_ProtoDecoder implements C0IMD<GuessWidgets> {
    public static GuessWidgets LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuessWidgets guessWidgets = new GuessWidgets();
        guessWidgets.guessWidgets = new ArrayList();
        guessWidgets.userRank = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        guessWidgets.userRank.add(_GuessRankUserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    guessWidgets.guessWidgets.add(_GuessWidget_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guessWidgets;
            }
        }
    }

    public static void LJ(GuessWidgets guessWidgets) {
        List<GuessWidget> list = guessWidgets.guessWidgets;
        if (list == null) {
            guessWidgets.guessWidgets = new ArrayList();
        } else if (!list.isEmpty()) {
            for (GuessWidget guessWidget : guessWidgets.guessWidgets) {
                if (guessWidget != null) {
                    _GuessWidget_ProtoDecoder.LJ(guessWidget);
                }
            }
        }
        List<GuessRankUserInfo> list2 = guessWidgets.userRank;
        if (list2 == null) {
            guessWidgets.userRank = new ArrayList();
        } else {
            if (list2.isEmpty()) {
                return;
            }
            Iterator<GuessRankUserInfo> it2 = guessWidgets.userRank.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuessWidgets guessWidgets) {
        LJ(guessWidgets);
    }

    @Override // X.C0IMD
    public final GuessWidgets LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuessWidgets guessWidgets, List list) {
    }
}
