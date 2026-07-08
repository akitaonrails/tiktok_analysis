package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HighScoreControlCfg_ProtoDecoder implements C0IMD<HighScoreControlCfg> {
    public static HighScoreControlCfg LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        HighScoreControlCfg highScoreControlCfg = new HighScoreControlCfg();
        highScoreControlCfg.originDisplayToUserList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            highScoreControlCfg.originDisplayToUserList.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        }
                    } else {
                        highScoreControlCfg.threshold = c1516680pZS.LJIIJJI();
                    }
                } else {
                    highScoreControlCfg.normalControlApplied = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return highScoreControlCfg;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(HighScoreControlCfg highScoreControlCfg) {
        HighScoreControlCfg highScoreControlCfg2 = highScoreControlCfg;
        if (highScoreControlCfg2.originDisplayToUserList == null) {
            highScoreControlCfg2.originDisplayToUserList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final HighScoreControlCfg LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HighScoreControlCfg highScoreControlCfg, List list) {
    }
}
