package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BillboardDisplayResult_ProtoDecoder implements C0IMD<BillboardDisplayResult> {
    public static BillboardDisplayResult LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BillboardDisplayResult billboardDisplayResult = new BillboardDisplayResult();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            billboardDisplayResult.displayResult = c1516680pZS.LJIIJ();
                        }
                    } else {
                        billboardDisplayResult.billboardId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    billboardDisplayResult.billboardType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return billboardDisplayResult;
            }
        }
    }

    @Override // X.C0IMD
    public final BillboardDisplayResult LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BillboardDisplayResult billboardDisplayResult) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BillboardDisplayResult billboardDisplayResult, List list) {
    }
}
