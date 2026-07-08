package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PopUp_ProtoDecoder implements C0IMD<PopUp> {
    public static PopUp LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PopUp popUp = new PopUp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        popUp.schema = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    popUp.needShow = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return popUp;
            }
        }
    }

    @Override // X.C0IMD
    public final PopUp LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PopUp popUp) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PopUp popUp, List list) {
    }
}
