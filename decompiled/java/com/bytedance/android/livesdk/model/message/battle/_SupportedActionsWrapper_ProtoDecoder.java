package com.bytedance.android.livesdk.model.message.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SupportedActionsWrapper_ProtoDecoder implements C0IMD<SupportedActionsWrapper> {
    public static SupportedActionsWrapper LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SupportedActionsWrapper supportedActionsWrapper = new SupportedActionsWrapper();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    supportedActionsWrapper.actionType = Long.valueOf(c1516680pZS.LJIIJJI());
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return supportedActionsWrapper;
            }
        }
    }

    @Override // X.C0IMD
    public final SupportedActionsWrapper LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SupportedActionsWrapper supportedActionsWrapper) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SupportedActionsWrapper supportedActionsWrapper, List list) {
    }
}
