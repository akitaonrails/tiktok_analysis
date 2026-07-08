package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BaLeadsGenInfo_ProtoDecoder implements C0IMD<BaLeadsGenInfo> {
    public static BaLeadsGenInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BaLeadsGenInfo baLeadsGenInfo = new BaLeadsGenInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        baLeadsGenInfo.leadsGenModel = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    baLeadsGenInfo.leadsGenPermission = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return baLeadsGenInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final BaLeadsGenInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BaLeadsGenInfo baLeadsGenInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BaLeadsGenInfo baLeadsGenInfo, List list) {
    }
}
