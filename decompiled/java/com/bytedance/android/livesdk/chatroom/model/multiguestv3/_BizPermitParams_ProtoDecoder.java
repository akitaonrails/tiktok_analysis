package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BizPermitParams_ProtoDecoder implements C0IMD<BizPermitParams> {
    public static BizPermitParams LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizPermitParams bizPermitParams = new BizPermitParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            bizPermitParams.permitType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        bizPermitParams.noticeConfirmed = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    bizPermitParams.effectiveSeconds = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizPermitParams;
            }
        }
    }

    @Override // X.C0IMD
    public final BizPermitParams LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BizPermitParams bizPermitParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizPermitParams bizPermitParams, List list) {
    }
}
