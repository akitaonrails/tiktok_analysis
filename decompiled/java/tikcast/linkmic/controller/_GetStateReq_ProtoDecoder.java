package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common._StateReqCommon_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _GetStateReq_ProtoDecoder implements C0IMD<GetStateReq> {
    @Override // X.C0IMD
    public final void LIZ(GetStateReq getStateReq) {
    }

    @Override // X.C0IMD
    public final GetStateReq LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetStateReq getStateReq = new GetStateReq();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        getStateReq.clientVersion = c1516680pZS.LJIIJJI();
                    }
                } else {
                    getStateReq.common = _StateReqCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return getStateReq;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetStateReq getStateReq, List list) {
    }
}
