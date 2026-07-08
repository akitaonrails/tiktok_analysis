package com.bytedance.android.livesdk.firstrecharge;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FirstChargeGuideEffectRule_ProtoDecoder implements C0IMD<FirstChargeGuideEffectRule> {
    public static FirstChargeGuideEffectRule LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FirstChargeGuideEffectRule firstChargeGuideEffectRule = new FirstChargeGuideEffectRule();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            firstChargeGuideEffectRule.pkRoomShowTime = c1516680pZS.LJIIJ();
                        }
                    } else {
                        firstChargeGuideEffectRule.enterRoomShowTime.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                    }
                } else {
                    firstChargeGuideEffectRule.guideEffectRule = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return firstChargeGuideEffectRule;
            }
        }
    }

    @Override // X.C0IMD
    public final FirstChargeGuideEffectRule LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(FirstChargeGuideEffectRule firstChargeGuideEffectRule) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FirstChargeGuideEffectRule firstChargeGuideEffectRule, List list) {
    }
}
