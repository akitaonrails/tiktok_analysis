package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RealtimeLiveCenterTrafficToolInfoIM_ProtoDecoder implements C0IMD<RealtimeLiveCenterTrafficToolInfoIM> {
    public static RealtimeLiveCenterTrafficToolInfoIM LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RealtimeLiveCenterTrafficToolInfoIM realtimeLiveCenterTrafficToolInfoIM = new RealtimeLiveCenterTrafficToolInfoIM();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        realtimeLiveCenterTrafficToolInfoIM.count = c1516680pZS.LJIIJJI();
                    }
                } else {
                    realtimeLiveCenterTrafficToolInfoIM.type = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return realtimeLiveCenterTrafficToolInfoIM;
            }
        }
    }

    @Override // X.C0IMD
    public final RealtimeLiveCenterTrafficToolInfoIM LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RealtimeLiveCenterTrafficToolInfoIM realtimeLiveCenterTrafficToolInfoIM) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RealtimeLiveCenterTrafficToolInfoIM realtimeLiveCenterTrafficToolInfoIM, List list) {
    }
}
