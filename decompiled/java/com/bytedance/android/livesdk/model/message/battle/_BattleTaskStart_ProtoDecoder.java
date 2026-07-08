package com.bytedance.android.livesdk.model.message.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleBonusConfig_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleTaskStart_ProtoDecoder implements C0IMD<BattleTaskStart> {
    public static BattleTaskStart LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleTaskStart battleTaskStart = new BattleTaskStart();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    battleTaskStart.battleBonusConfig = _BattleBonusConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleTaskStart;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleTaskStart battleTaskStart) {
        BattleBonusConfig battleBonusConfig = battleTaskStart.battleBonusConfig;
        if (battleBonusConfig != null) {
            _BattleBonusConfig_ProtoDecoder.LJ(battleBonusConfig);
        }
    }

    @Override // X.C0IMD
    public final BattleTaskStart LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleTaskStart battleTaskStart, List list) {
    }
}
