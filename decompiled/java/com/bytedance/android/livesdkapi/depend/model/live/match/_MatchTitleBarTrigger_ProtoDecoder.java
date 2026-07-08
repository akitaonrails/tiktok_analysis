package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MatchTitleBarTrigger_ProtoDecoder implements C0IMD<MatchTitleBarTrigger> {
    public static MatchTitleBarTrigger LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MatchTitleBarTrigger matchTitleBarTrigger = new MatchTitleBarTrigger();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    matchTitleBarTrigger.type = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return matchTitleBarTrigger;
            }
        }
    }

    @Override // X.C0IMD
    public final MatchTitleBarTrigger LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MatchTitleBarTrigger matchTitleBarTrigger) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MatchTitleBarTrigger matchTitleBarTrigger, List list) {
    }
}
