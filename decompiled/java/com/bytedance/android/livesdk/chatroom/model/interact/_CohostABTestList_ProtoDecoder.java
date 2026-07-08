package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostABTestList_ProtoDecoder implements C0IMD<CohostABTestList> {
    public static CohostABTestList LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostABTestList cohostABTestList = new CohostABTestList();
        cohostABTestList.abTestList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    cohostABTestList.abTestList.add(_CohostABTest_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostABTestList;
            }
        }
    }

    public static void LJ(CohostABTestList cohostABTestList) {
        List<CohostABTest> list = cohostABTestList.abTestList;
        if (list == null) {
            cohostABTestList.abTestList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<CohostABTest> it2 = cohostABTestList.abTestList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CohostABTestList cohostABTestList) {
        LJ(cohostABTestList);
    }

    @Override // X.C0IMD
    public final CohostABTestList LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostABTestList cohostABTestList, List list) {
    }
}
