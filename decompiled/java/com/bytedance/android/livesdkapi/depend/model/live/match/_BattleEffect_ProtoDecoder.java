package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleEffect_ProtoDecoder implements C0IMD<BattleEffect> {
    public static BattleEffect LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleEffect battleEffect = new BattleEffect();
        battleEffect.uidList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            battleEffect.effectExtra = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        battleEffect.uidList.add(C1516700pZU.LIZLLL(c1516680pZS));
                    }
                } else {
                    battleEffect.type = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleEffect;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleEffect battleEffect) {
        BattleEffect battleEffect2 = battleEffect;
        if (battleEffect2.uidList == null) {
            battleEffect2.uidList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final BattleEffect LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleEffect battleEffect, List list) {
    }
}
