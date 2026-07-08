package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomAuthMessageGoldenEnvelope_ProtoDecoder implements C0IMD<RoomAuthMessageGoldenEnvelope> {
    public static RoomAuthMessageGoldenEnvelope LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomAuthMessageGoldenEnvelope roomAuthMessageGoldenEnvelope = new RoomAuthMessageGoldenEnvelope();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    roomAuthMessageGoldenEnvelope.revokeEndTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomAuthMessageGoldenEnvelope;
            }
        }
    }

    @Override // X.C0IMD
    public final RoomAuthMessageGoldenEnvelope LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RoomAuthMessageGoldenEnvelope roomAuthMessageGoldenEnvelope) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomAuthMessageGoldenEnvelope roomAuthMessageGoldenEnvelope, List list) {
    }
}
