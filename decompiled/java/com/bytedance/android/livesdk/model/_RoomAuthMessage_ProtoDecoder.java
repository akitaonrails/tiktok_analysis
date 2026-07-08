package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomAuthMessage_ProtoDecoder implements C0IMD<RoomAuthMessage> {
    public static RoomAuthMessage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomAuthMessage roomAuthMessage = new RoomAuthMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        roomAuthMessage.promoteOtherMessage = _PromoteOtherMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    roomAuthMessage.goldenEnvelope = _RoomAuthMessageGoldenEnvelope_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomAuthMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RoomAuthMessage roomAuthMessage) {
    }

    @Override // X.C0IMD
    public final RoomAuthMessage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomAuthMessage roomAuthMessage, List list) {
    }
}
