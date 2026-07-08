package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostABTest_ProtoDecoder implements C0IMD<CohostABTest> {
    public static CohostABTest LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostABTest cohostABTest = new CohostABTest();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        cohostABTest.group = c1516680pZS.LJIIJJI();
                    }
                } else {
                    cohostABTest.abTestType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostABTest;
            }
        }
    }

    @Override // X.C0IMD
    public final CohostABTest LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CohostABTest cohostABTest) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostABTest cohostABTest, List list) {
    }
}
