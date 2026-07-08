package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CapsuleBizParamsEcom_ProtoDecoder implements C0IMD<CapsuleBizParamsEcom> {
    public static CapsuleBizParamsEcom LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CapsuleBizParamsEcom capsuleBizParamsEcom = new CapsuleBizParamsEcom();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 3) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    capsuleBizParamsEcom.eventTracking = _CapsuleBizParamsEcom_EventTracking_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return capsuleBizParamsEcom;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CapsuleBizParamsEcom capsuleBizParamsEcom) {
    }

    @Override // X.C0IMD
    public final CapsuleBizParamsEcom LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CapsuleBizParamsEcom capsuleBizParamsEcom, List list) {
    }
}
