package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common._StateReqCommon_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _AckStateReq_ProtoDecoder implements C0IMD<AckStateReq> {
    @Override // X.C0IMD
    public final void LIZ(AckStateReq ackStateReq) {
    }

    @Override // X.C0IMD
    public final AckStateReq LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AckStateReq ackStateReq = new AckStateReq();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                ackStateReq.clientReceiveTime = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            ackStateReq.msgType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        ackStateReq.msgId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    ackStateReq.common = _StateReqCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return ackStateReq;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AckStateReq ackStateReq, List list) {
    }
}
