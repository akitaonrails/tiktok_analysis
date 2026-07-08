package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.ReserveResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ReserveResponse_ReserveExtra_ProtoDecoder implements C0IMD<ReserveResponse.ReserveExtra> {
    public static ReserveResponse.ReserveExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ReserveResponse.ReserveExtra reserveExtra = new ReserveResponse.ReserveExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    reserveExtra.logPb = _ReserveResponse_ReserveExtra_LogPb_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return reserveExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ReserveResponse.ReserveExtra reserveExtra) {
    }

    @Override // X.C0IMD
    public final ReserveResponse.ReserveExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ReserveResponse.ReserveExtra reserveExtra, List list) {
    }
}
