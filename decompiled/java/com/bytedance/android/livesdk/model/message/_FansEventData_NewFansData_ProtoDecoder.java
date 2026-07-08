package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.FansEventData;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FansEventData_NewFansData_ProtoDecoder implements C0IMD<FansEventData.NewFansData> {
    public static FansEventData.NewFansData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FansEventData.NewFansData newFansData = new FansEventData.NewFansData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    newFansData.fansCount = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return newFansData;
            }
        }
    }

    @Override // X.C0IMD
    public final FansEventData.NewFansData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(FansEventData.NewFansData newFansData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FansEventData.NewFansData newFansData, List list) {
    }
}
