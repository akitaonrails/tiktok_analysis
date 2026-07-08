package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MGetABInfosReq_ProtoDecoder implements C0IMD<MGetABInfosReq> {
    @Override // X.C0IMD
    public final void LIZ(MGetABInfosReq mGetABInfosReq) {
        MGetABInfosReq mGetABInfosReq2 = mGetABInfosReq;
        if (mGetABInfosReq2.cdidList == null) {
            mGetABInfosReq2.cdidList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final MGetABInfosReq LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MGetABInfosReq mGetABInfosReq = new MGetABInfosReq();
        mGetABInfosReq.cdidList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        mGetABInfosReq.linkmicScene = c1516680pZS.LJIIJJI();
                    }
                } else {
                    mGetABInfosReq.cdidList.add(C1516700pZU.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return mGetABInfosReq;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MGetABInfosReq mGetABInfosReq, List list) {
    }
}
