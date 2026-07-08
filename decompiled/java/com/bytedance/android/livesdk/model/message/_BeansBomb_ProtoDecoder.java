package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BeansBomb_ProtoDecoder implements C0IMD<BeansBomb> {
    public static BeansBomb LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BeansBomb beansBomb = new BeansBomb();
        beansBomb.targetAnchorIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        beansBomb.targetAnchorIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    beansBomb.bombType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return beansBomb;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BeansBomb beansBomb) {
        BeansBomb beansBomb2 = beansBomb;
        if (beansBomb2.targetAnchorIds == null) {
            beansBomb2.targetAnchorIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final BeansBomb LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BeansBomb beansBomb, List list) {
    }
}
