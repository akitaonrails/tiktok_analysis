package webcast.api.linkmic;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.linkmic.ApplyResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _ApplyResponse_ApplyExtra_LogPb_ProtoDecoder implements C0IMD<ApplyResponse.ApplyExtra.LogPb> {
    public static ApplyResponse.ApplyExtra.LogPb LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ApplyResponse.ApplyExtra.LogPb logPb = new ApplyResponse.ApplyExtra.LogPb();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    logPb.clientLogId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return logPb;
            }
        }
    }

    @Override // X.C0IMD
    public final ApplyResponse.ApplyExtra.LogPb LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ApplyResponse.ApplyExtra.LogPb logPb) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ApplyResponse.ApplyExtra.LogPb logPb, List list) {
    }
}
