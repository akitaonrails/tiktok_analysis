package com.bytedance.android.livesdk.model.message.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ExemptStrategy_ProtoDecoder implements C0IMD<ExemptStrategy> {
    public static ExemptStrategy LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ExemptStrategy exemptStrategy = new ExemptStrategy();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        exemptStrategy.exemptAudienceTop = c1516680pZS.LJIIJ();
                    }
                } else {
                    exemptStrategy.exemptBothHost = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return exemptStrategy;
            }
        }
    }

    @Override // X.C0IMD
    public final ExemptStrategy LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ExemptStrategy exemptStrategy) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ExemptStrategy exemptStrategy, List list) {
    }
}
