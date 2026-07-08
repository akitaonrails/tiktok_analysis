package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleTruthOrDare_ProtoDecoder implements C0IMD<BattleTruthOrDare> {
    public static BattleTruthOrDare LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleTruthOrDare battleTruthOrDare = new BattleTruthOrDare();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    battleTruthOrDare.lapGuideDurationSecond = c1516680pZS.LJIIJ();
                                }
                            } else {
                                battleTruthOrDare.lapGuideKey = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            battleTruthOrDare.anchorRegion = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        battleTruthOrDare.ruleDetailUrl = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    battleTruthOrDare.triggered = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleTruthOrDare;
            }
        }
    }

    @Override // X.C0IMD
    public final BattleTruthOrDare LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BattleTruthOrDare battleTruthOrDare) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleTruthOrDare battleTruthOrDare, List list) {
    }
}
