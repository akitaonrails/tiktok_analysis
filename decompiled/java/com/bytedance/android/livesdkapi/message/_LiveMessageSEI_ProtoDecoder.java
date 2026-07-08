package com.bytedance.android.livesdkapi.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _LiveMessageSEI_ProtoDecoder implements C0IMD<LiveMessageSEI> {
    public static LiveMessageSEI LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveMessageSEI liveMessageSEI = new LiveMessageSEI();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        liveMessageSEI.timestamp = c1516680pZS.LJIIJJI();
                    }
                } else {
                    liveMessageSEI.uniqueID = _LiveMessageID_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveMessageSEI;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveMessageSEI liveMessageSEI) {
    }

    @Override // X.C0IMD
    public final LiveMessageSEI LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveMessageSEI liveMessageSEI, List list) {
    }
}
