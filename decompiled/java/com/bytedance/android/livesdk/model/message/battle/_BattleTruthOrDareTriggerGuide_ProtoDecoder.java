package com.bytedance.android.livesdk.model.message.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleTruthOrDareTriggerGuide_ProtoDecoder implements C0IMD<BattleTruthOrDareTriggerGuide> {
    public static BattleTruthOrDareTriggerGuide LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleTruthOrDareTriggerGuide battleTruthOrDareTriggerGuide = new BattleTruthOrDareTriggerGuide();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                battleTruthOrDareTriggerGuide.ruleDetailUrl = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            battleTruthOrDareTriggerGuide.guideDurationSecond = c1516680pZS.LJIIJ();
                        }
                    } else {
                        battleTruthOrDareTriggerGuide.audienceContentKey = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    battleTruthOrDareTriggerGuide.anchorContentKey = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleTruthOrDareTriggerGuide;
            }
        }
    }

    @Override // X.C0IMD
    public final BattleTruthOrDareTriggerGuide LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BattleTruthOrDareTriggerGuide battleTruthOrDareTriggerGuide) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleTruthOrDareTriggerGuide battleTruthOrDareTriggerGuide, List list) {
    }
}
