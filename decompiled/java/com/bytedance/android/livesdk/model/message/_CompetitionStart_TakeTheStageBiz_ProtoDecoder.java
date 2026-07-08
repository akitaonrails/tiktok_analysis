package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.CompetitionStart;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionStart_TakeTheStageBiz_ProtoDecoder implements C0IMD<CompetitionStart.TakeTheStageBiz> {
    public static CompetitionStart.TakeTheStageBiz LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionStart.TakeTheStageBiz takeTheStageBiz = new CompetitionStart.TakeTheStageBiz();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    takeTheStageBiz.plannedPerformanceEndTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return takeTheStageBiz;
            }
        }
    }

    @Override // X.C0IMD
    public final CompetitionStart.TakeTheStageBiz LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CompetitionStart.TakeTheStageBiz takeTheStageBiz) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionStart.TakeTheStageBiz takeTheStageBiz, List list) {
    }
}
