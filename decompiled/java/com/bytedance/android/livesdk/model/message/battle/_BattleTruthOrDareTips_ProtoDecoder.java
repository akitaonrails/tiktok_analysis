package com.bytedance.android.livesdk.model.message.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleTruthOrDareTips_ProtoDecoder implements C0IMD<BattleTruthOrDareTips> {
    public static BattleTruthOrDareTips LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleTruthOrDareTips battleTruthOrDareTips = new BattleTruthOrDareTips();
        battleTruthOrDareTips.truthOrDareTips = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        battleTruthOrDareTips.giftGuideKey = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    battleTruthOrDareTips.truthOrDareTips.add(_TruthOrDareTip_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleTruthOrDareTips;
            }
        }
    }

    public static void LJ(BattleTruthOrDareTips battleTruthOrDareTips) {
        List<TruthOrDareTip> list = battleTruthOrDareTips.truthOrDareTips;
        if (list == null) {
            battleTruthOrDareTips.truthOrDareTips = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<TruthOrDareTip> it2 = battleTruthOrDareTips.truthOrDareTips.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleTruthOrDareTips battleTruthOrDareTips) {
        LJ(battleTruthOrDareTips);
    }

    @Override // X.C0IMD
    public final BattleTruthOrDareTips LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleTruthOrDareTips battleTruthOrDareTips, List list) {
    }
}
