package com.bytedance.android.livesdk.model.message.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleTaskSettle_ProtoDecoder implements C0IMD<BattleTaskSettle> {
    public static BattleTaskSettle LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleTaskSettle battleTaskSettle = new BattleTaskSettle();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            battleTaskSettle.rewardStartTimestamp = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        battleTaskSettle.rewardStartTime = c1516680pZS.LJIIJJI();
                    }
                } else {
                    battleTaskSettle.taskResult = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleTaskSettle;
            }
        }
    }

    @Override // X.C0IMD
    public final BattleTaskSettle LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BattleTaskSettle battleTaskSettle) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleTaskSettle battleTaskSettle, List list) {
    }
}
