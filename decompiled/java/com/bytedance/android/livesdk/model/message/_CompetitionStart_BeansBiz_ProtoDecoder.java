package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.CompetitionStart;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionStart_BeansBiz_ProtoDecoder implements C0IMD<CompetitionStart.BeansBiz> {
    public static CompetitionStart.BeansBiz LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionStart.BeansBiz beansBiz = new CompetitionStart.BeansBiz();
        beansBiz.systemBombIntervals = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    beansBiz.systemBombIntervals.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return beansBiz;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionStart.BeansBiz beansBiz) {
        CompetitionStart.BeansBiz beansBiz2 = beansBiz;
        if (beansBiz2.systemBombIntervals == null) {
            beansBiz2.systemBombIntervals = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final CompetitionStart.BeansBiz LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionStart.BeansBiz beansBiz, List list) {
    }
}
