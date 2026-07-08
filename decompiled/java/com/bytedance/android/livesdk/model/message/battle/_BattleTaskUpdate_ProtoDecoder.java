package com.bytedance.android.livesdk.model.message.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleTaskUpdate_ProtoDecoder implements C0IMD<BattleTaskUpdate> {
    public static BattleTaskUpdate LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleTaskUpdate battleTaskUpdate = new BattleTaskUpdate();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 21) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                battleTaskUpdate.logId = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            battleTaskUpdate.promptKey = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        battleTaskUpdate.fromUserUid = c1516680pZS.LJIIJJI();
                    }
                } else {
                    battleTaskUpdate.taskProgress = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleTaskUpdate;
            }
        }
    }

    @Override // X.C0IMD
    public final BattleTaskUpdate LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BattleTaskUpdate battleTaskUpdate) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleTaskUpdate battleTaskUpdate, List list) {
    }
}
