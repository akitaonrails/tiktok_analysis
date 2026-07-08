package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DelayParam_ProtoDecoder implements C0IMD<DelayParam> {
    public static DelayParam LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        DelayParam delayParam = new DelayParam();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        delayParam.maxDelayMs = c1516680pZS.LJIIJJI();
                    }
                } else {
                    delayParam.minDelayMs = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return delayParam;
            }
        }
    }

    @Override // X.C0IMD
    public final DelayParam LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(DelayParam delayParam) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DelayParam delayParam, List list) {
    }
}
