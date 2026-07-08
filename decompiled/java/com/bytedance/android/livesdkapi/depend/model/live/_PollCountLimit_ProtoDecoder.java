package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PollCountLimit_ProtoDecoder implements C0IMD<PollCountLimit> {
    public static PollCountLimit LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PollCountLimit pollCountLimit = new PollCountLimit();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            pollCountLimit.unlimited = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        pollCountLimit.currentPollCount = c1516680pZS.LJIIJJI();
                    }
                } else {
                    pollCountLimit.maxPollCount = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pollCountLimit;
            }
        }
    }

    @Override // X.C0IMD
    public final PollCountLimit LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PollCountLimit pollCountLimit) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PollCountLimit pollCountLimit, List list) {
    }
}
