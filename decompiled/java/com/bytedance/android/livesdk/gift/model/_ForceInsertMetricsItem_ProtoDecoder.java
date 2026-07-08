package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ForceInsertMetricsItem_ProtoDecoder implements C0IMD<ForceInsertMetricsItem> {
    public static ForceInsertMetricsItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ForceInsertMetricsItem forceInsertMetricsItem = new ForceInsertMetricsItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        forceInsertMetricsItem.forceIndexConfig = c1516680pZS.LJIIJ();
                    }
                } else {
                    forceInsertMetricsItem.forceInsertType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return forceInsertMetricsItem;
            }
        }
    }

    @Override // X.C0IMD
    public final ForceInsertMetricsItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ForceInsertMetricsItem forceInsertMetricsItem) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ForceInsertMetricsItem forceInsertMetricsItem, List list) {
    }
}
