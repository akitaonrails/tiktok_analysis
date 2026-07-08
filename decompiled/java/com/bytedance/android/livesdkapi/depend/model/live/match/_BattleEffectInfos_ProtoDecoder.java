package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleEffectInfos_ProtoDecoder implements C0IMD<BattleEffectInfos> {
    public static BattleEffectInfos LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleEffectInfos battleEffectInfos = new BattleEffectInfos();
        battleEffectInfos.effectInfoList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        battleEffectInfos.effectListVersion = c1516680pZS.LJIIJJI();
                    }
                } else {
                    battleEffectInfos.effectInfoList.add(_BattleEffect_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleEffectInfos;
            }
        }
    }

    public static void LJ(BattleEffectInfos battleEffectInfos) {
        List<BattleEffect> list = battleEffectInfos.effectInfoList;
        if (list == null) {
            battleEffectInfos.effectInfoList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (BattleEffect battleEffect : battleEffectInfos.effectInfoList) {
            if (battleEffect != null && battleEffect.uidList == null) {
                battleEffect.uidList = new ArrayList();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleEffectInfos battleEffectInfos) {
        LJ(battleEffectInfos);
    }

    @Override // X.C0IMD
    public final BattleEffectInfos LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleEffectInfos battleEffectInfos, List list) {
    }
}
