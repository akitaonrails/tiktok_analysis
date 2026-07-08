package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomAuthOffReasons_ProtoDecoder implements C0IMD<RoomAuthOffReasons> {
    public static RoomAuthOffReasons LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomAuthOffReasons roomAuthOffReasons = new RoomAuthOffReasons();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        roomAuthOffReasons.unAvailableClickReason = (int) c1516680pZS.LJIIJJI();
                    }
                } else {
                    roomAuthOffReasons.gift = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomAuthOffReasons;
            }
        }
    }

    @Override // X.C0IMD
    public final RoomAuthOffReasons LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RoomAuthOffReasons roomAuthOffReasons) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomAuthOffReasons roomAuthOffReasons, List list) {
    }
}
