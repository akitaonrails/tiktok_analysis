package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _OecLiveCreatorAction_ProtoDecoder implements C0IMD<OecLiveCreatorAction> {
    public static OecLiveCreatorAction LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        OecLiveCreatorAction oecLiveCreatorAction = new OecLiveCreatorAction();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        oecLiveCreatorAction.version = c1516680pZS.LJIIJJI();
                    }
                } else {
                    oecLiveCreatorAction.action = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return oecLiveCreatorAction;
            }
        }
    }

    @Override // X.C0IMD
    public final OecLiveCreatorAction LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(OecLiveCreatorAction oecLiveCreatorAction) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OecLiveCreatorAction oecLiveCreatorAction, List list) {
    }
}
