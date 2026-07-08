package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostABTestSetting_ProtoDecoder implements C0IMD<CohostABTestSetting> {
    public static CohostABTestSetting LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostABTestSetting cohostABTestSetting = new CohostABTestSetting();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        cohostABTestSetting.value = _CohostABTestList_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    cohostABTestSetting.key = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostABTestSetting;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CohostABTestSetting cohostABTestSetting) {
        CohostABTestList cohostABTestList = cohostABTestSetting.value;
        if (cohostABTestList != null) {
            _CohostABTestList_ProtoDecoder.LJ(cohostABTestList);
        }
    }

    @Override // X.C0IMD
    public final CohostABTestSetting LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostABTestSetting cohostABTestSetting, List list) {
    }
}
