package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ChangeStateResp_ProtoDecoder implements C0IMD<ChangeStateResp> {
    @Override // X.C0IMD
    public final ChangeStateResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ChangeStateResp changeStateResp = new ChangeStateResp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    changeStateResp.result = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return changeStateResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ChangeStateResp changeStateResp) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ChangeStateResp changeStateResp, List list) {
    }
}
