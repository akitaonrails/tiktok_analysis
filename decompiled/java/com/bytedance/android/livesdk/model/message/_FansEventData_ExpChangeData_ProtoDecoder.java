package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.FansEventData;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FansEventData_ExpChangeData_ProtoDecoder implements C0IMD<FansEventData.ExpChangeData> {
    public static FansEventData.ExpChangeData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FansEventData.ExpChangeData expChangeData = new FansEventData.ExpChangeData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        expChangeData.totalUnclaimedScore = c1516680pZS.LJIIJJI();
                    }
                } else {
                    expChangeData.claimedAllPoints = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return expChangeData;
            }
        }
    }

    @Override // X.C0IMD
    public final FansEventData.ExpChangeData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(FansEventData.ExpChangeData expChangeData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FansEventData.ExpChangeData expChangeData, List list) {
    }
}
