package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ReceiverRestriction_ProtoDecoder implements C0IMD<ReceiverRestriction> {
    public static ReceiverRestriction LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ReceiverRestriction receiverRestriction = new ReceiverRestriction();
        receiverRestriction.hiddenGids = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        receiverRestriction.hiddenGids.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    receiverRestriction.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return receiverRestriction;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ReceiverRestriction receiverRestriction) {
        ReceiverRestriction receiverRestriction2 = receiverRestriction;
        if (receiverRestriction2.hiddenGids == null) {
            receiverRestriction2.hiddenGids = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final ReceiverRestriction LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ReceiverRestriction receiverRestriction, List list) {
    }
}
