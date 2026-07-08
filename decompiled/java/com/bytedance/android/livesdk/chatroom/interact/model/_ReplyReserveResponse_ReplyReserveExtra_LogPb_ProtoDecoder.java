package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.ReplyReserveResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ReplyReserveResponse_ReplyReserveExtra_LogPb_ProtoDecoder implements C0IMD<ReplyReserveResponse.ReplyReserveExtra.LogPb> {
    public static ReplyReserveResponse.ReplyReserveExtra.LogPb LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ReplyReserveResponse.ReplyReserveExtra.LogPb logPb = new ReplyReserveResponse.ReplyReserveExtra.LogPb();
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
    public final ReplyReserveResponse.ReplyReserveExtra.LogPb LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ReplyReserveResponse.ReplyReserveExtra.LogPb logPb) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ReplyReserveResponse.ReplyReserveExtra.LogPb logPb, List list) {
    }
}
