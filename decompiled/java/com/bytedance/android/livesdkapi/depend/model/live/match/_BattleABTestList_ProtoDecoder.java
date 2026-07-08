package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleABTestList_ProtoDecoder implements C0IMD<BattleABTestList> {
    public static BattleABTestList LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleABTestList battleABTestList = new BattleABTestList();
        battleABTestList.abTestList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    battleABTestList.abTestList.add(_BattleABTest_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleABTestList;
            }
        }
    }

    public static void LJ(BattleABTestList battleABTestList) {
        List<BattleABTest> list = battleABTestList.abTestList;
        if (list == null) {
            battleABTestList.abTestList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<BattleABTest> it2 = battleABTestList.abTestList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleABTestList battleABTestList) {
        LJ(battleABTestList);
    }

    @Override // X.C0IMD
    public final BattleABTestList LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleABTestList battleABTestList, List list) {
    }
}
