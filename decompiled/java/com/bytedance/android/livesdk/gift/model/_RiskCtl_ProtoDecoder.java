package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RiskCtl_ProtoDecoder implements C0IMD<RiskCtl> {
    public static RiskCtl LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RiskCtl riskCtl = new RiskCtl();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            riskCtl.toastReason = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        riskCtl.errorMsg = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    riskCtl.disableSendGift = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return riskCtl;
            }
        }
    }

    @Override // X.C0IMD
    public final RiskCtl LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RiskCtl riskCtl) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RiskCtl riskCtl, List list) {
    }
}
