package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.game.model.GuessWidgets;
import com.bytedance.android.livesdk.game.model._GuessWidgets_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuessWidgetsData_ProtoDecoder implements C0IMD<GuessWidgetsData> {
    public static GuessWidgetsData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuessWidgetsData guessWidgetsData = new GuessWidgetsData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    guessWidgetsData.guessWidgets = _GuessWidgets_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guessWidgetsData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuessWidgetsData guessWidgetsData) {
        GuessWidgets guessWidgets = guessWidgetsData.guessWidgets;
        if (guessWidgets != null) {
            _GuessWidgets_ProtoDecoder.LJ(guessWidgets);
        }
    }

    @Override // X.C0IMD
    public final GuessWidgetsData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuessWidgetsData guessWidgetsData, List list) {
    }
}
