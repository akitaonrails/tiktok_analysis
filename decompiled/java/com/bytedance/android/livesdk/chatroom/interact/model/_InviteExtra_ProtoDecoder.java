package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _InviteExtra_ProtoDecoder implements C0IMD<InviteExtra> {
    public static InviteExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        InviteExtra inviteExtra = new InviteExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    inviteExtra.logPb = _InviteExtra_LogPb_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return inviteExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(InviteExtra inviteExtra) {
    }

    @Override // X.C0IMD
    public final InviteExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, InviteExtra inviteExtra, List list) {
    }
}
