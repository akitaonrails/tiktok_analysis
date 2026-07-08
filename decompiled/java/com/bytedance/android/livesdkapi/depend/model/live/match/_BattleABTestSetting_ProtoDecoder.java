package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleABTestSetting_ProtoDecoder implements C0IMD<BattleABTestSetting> {
    public static BattleABTestSetting LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleABTestSetting battleABTestSetting = new BattleABTestSetting();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        battleABTestSetting.abTestList = _BattleABTestList_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    battleABTestSetting.uid = Long.valueOf(c1516680pZS.LJIIJJI());
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleABTestSetting;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleABTestSetting battleABTestSetting) {
        BattleABTestList battleABTestList = battleABTestSetting.abTestList;
        if (battleABTestList != null) {
            _BattleABTestList_ProtoDecoder.LJ(battleABTestList);
        }
    }

    @Override // X.C0IMD
    public final BattleABTestSetting LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleABTestSetting battleABTestSetting, List list) {
    }
}
