package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsEcom;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CapsuleBizParamsEcom_EventTracking_ProtoDecoder implements C0IMD<CapsuleBizParamsEcom.EventTracking> {
    public static CapsuleBizParamsEcom.EventTracking LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CapsuleBizParamsEcom.EventTracking eventTracking = new CapsuleBizParamsEcom.EventTracking();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        eventTracking.ecomRecommTrigger = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    eventTracking.ecomRecommId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return eventTracking;
            }
        }
    }

    @Override // X.C0IMD
    public final CapsuleBizParamsEcom.EventTracking LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CapsuleBizParamsEcom.EventTracking eventTracking) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CapsuleBizParamsEcom.EventTracking eventTracking, List list) {
    }
}
