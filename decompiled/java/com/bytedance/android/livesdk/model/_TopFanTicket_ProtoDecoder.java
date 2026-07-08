package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TopFanTicket_ProtoDecoder implements C0IMD<TopFanTicket> {
    public static TopFanTicket LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TopFanTicket topFanTicket = new TopFanTicket();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        topFanTicket.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    topFanTicket.fanTicket = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return topFanTicket;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TopFanTicket topFanTicket) {
        User user = topFanTicket.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final TopFanTicket LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopFanTicket topFanTicket, List list) {
    }
}
