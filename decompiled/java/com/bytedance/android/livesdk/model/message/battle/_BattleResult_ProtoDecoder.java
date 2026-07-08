package com.bytedance.android.livesdk.model.message.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleResult_ProtoDecoder implements C0IMD<BattleResult> {
    public static BattleResult LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleResult battleResult = new BattleResult();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 5) {
                                if (iLJI != 6) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    battleResult.enigmaUv = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                battleResult.enigmaScore = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            battleResult.score = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        battleResult.result = c1516680pZS.LJIIJ();
                    }
                } else {
                    battleResult.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleResult;
            }
        }
    }

    @Override // X.C0IMD
    public final BattleResult LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BattleResult battleResult) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleResult battleResult, List list) {
    }
}
