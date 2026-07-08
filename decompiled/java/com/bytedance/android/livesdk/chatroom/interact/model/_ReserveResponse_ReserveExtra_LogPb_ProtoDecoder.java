package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.ReserveResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ReserveResponse_ReserveExtra_LogPb_ProtoDecoder implements C0IMD<ReserveResponse.ReserveExtra.LogPb> {
    public static ReserveResponse.ReserveExtra.LogPb LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ReserveResponse.ReserveExtra.LogPb logPb = new ReserveResponse.ReserveExtra.LogPb();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    logPb.imprId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return logPb;
            }
        }
    }

    @Override // X.C0IMD
    public final ReserveResponse.ReserveExtra.LogPb LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ReserveResponse.ReserveExtra.LogPb logPb) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ReserveResponse.ReserveExtra.LogPb logPb, List list) {
    }
}
