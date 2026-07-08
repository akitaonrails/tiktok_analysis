package com.bytedance.android.livesdkapi.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _LiveMessageID_ProtoDecoder implements C0IMD<LiveMessageID> {
    public static LiveMessageID LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveMessageID liveMessageID = new LiveMessageID();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        liveMessageID.messageScene = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    liveMessageID.primaryID = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveMessageID;
            }
        }
    }

    @Override // X.C0IMD
    public final LiveMessageID LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LiveMessageID liveMessageID) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveMessageID liveMessageID, List list) {
    }
}
