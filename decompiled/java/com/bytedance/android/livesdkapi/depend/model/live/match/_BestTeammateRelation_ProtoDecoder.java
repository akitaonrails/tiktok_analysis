package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BestTeammateRelation_ProtoDecoder implements C0IMD<BestTeammateRelation> {
    public static BestTeammateRelation LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BestTeammateRelation bestTeammateRelation = new BestTeammateRelation();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        bestTeammateRelation.bestTeammateId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    bestTeammateRelation.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bestTeammateRelation;
            }
        }
    }

    @Override // X.C0IMD
    public final BestTeammateRelation LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BestTeammateRelation bestTeammateRelation) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BestTeammateRelation bestTeammateRelation, List list) {
    }
}
