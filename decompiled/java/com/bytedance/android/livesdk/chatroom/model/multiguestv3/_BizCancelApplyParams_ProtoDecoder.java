package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BizCancelApplyParams_ProtoDecoder implements C0IMD<BizCancelApplyParams> {
    public static BizCancelApplyParams LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizCancelApplyParams bizCancelApplyParams = new BizCancelApplyParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    bizCancelApplyParams.anchorId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizCancelApplyParams;
            }
        }
    }

    @Override // X.C0IMD
    public final BizCancelApplyParams LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BizCancelApplyParams bizCancelApplyParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizCancelApplyParams bizCancelApplyParams, List list) {
    }
}
