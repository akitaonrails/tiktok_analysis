package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Gift;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Gift_BatchGiftInfo_ProtoDecoder implements C0IMD<Gift.BatchGiftInfo> {
    public static Gift.BatchGiftInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Gift.BatchGiftInfo batchGiftInfo = new Gift.BatchGiftInfo();
        batchGiftInfo.availableCounts = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        batchGiftInfo.availableCounts.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    batchGiftInfo.canBatchSend = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return batchGiftInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Gift.BatchGiftInfo batchGiftInfo) {
        Gift.BatchGiftInfo batchGiftInfo2 = batchGiftInfo;
        if (batchGiftInfo2.availableCounts == null) {
            batchGiftInfo2.availableCounts = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final Gift.BatchGiftInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Gift.BatchGiftInfo batchGiftInfo, List list) {
    }
}
