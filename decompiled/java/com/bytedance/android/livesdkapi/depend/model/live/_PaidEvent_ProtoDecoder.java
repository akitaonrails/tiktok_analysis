package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PaidEvent_ProtoDecoder implements C0IMD<PaidEvent> {
    public static PaidEvent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PaidEvent paidEvent = new PaidEvent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        paidEvent.paidType = c1516680pZS.LJIIJ();
                    }
                } else {
                    paidEvent.eventId = Long.valueOf(c1516680pZS.LJIIJJI());
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return paidEvent;
            }
        }
    }

    @Override // X.C0IMD
    public final PaidEvent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PaidEvent paidEvent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PaidEvent paidEvent, List list) {
    }
}
