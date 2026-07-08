package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.InviteExtra;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _InviteExtra_LogPb_ProtoDecoder implements C0IMD<InviteExtra.LogPb> {
    public static InviteExtra.LogPb LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        InviteExtra.LogPb logPb = new InviteExtra.LogPb();
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
    public final InviteExtra.LogPb LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(InviteExtra.LogPb logPb) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, InviteExtra.LogPb logPb, List list) {
    }
}
