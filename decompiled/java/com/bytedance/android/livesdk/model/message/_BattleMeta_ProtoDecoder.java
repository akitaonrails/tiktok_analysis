package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleMeta_ProtoDecoder implements C0IMD<BattleMeta> {
    public static BattleMeta LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleMeta battleMeta = new BattleMeta();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            battleMeta.anchorId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        battleMeta.roomId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    battleMeta.battleId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleMeta;
            }
        }
    }

    @Override // X.C0IMD
    public final BattleMeta LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BattleMeta battleMeta) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleMeta battleMeta, List list) {
    }
}
