package com.bytedance.android.livesdk.model.message.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattlePrompt_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleRewardSettle_ProtoDecoder implements C0IMD<BattleRewardSettle> {
    public static BattleRewardSettle LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleRewardSettle battleRewardSettle = new BattleRewardSettle();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        battleRewardSettle.status = c1516680pZS.LJIIJ();
                    }
                } else {
                    battleRewardSettle.rewardSettlePrompt = _BattlePrompt_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleRewardSettle;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleRewardSettle battleRewardSettle) {
        BattlePrompt battlePrompt = battleRewardSettle.rewardSettlePrompt;
        if (battlePrompt != null) {
            _BattlePrompt_ProtoDecoder.LJ(battlePrompt);
        }
    }

    @Override // X.C0IMD
    public final BattleRewardSettle LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleRewardSettle battleRewardSettle, List list) {
    }
}
