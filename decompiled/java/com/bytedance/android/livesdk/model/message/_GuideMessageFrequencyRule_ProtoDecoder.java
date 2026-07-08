package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuideMessageFrequencyRule_ProtoDecoder implements C0IMD<GuideMessageFrequencyRule> {
    public static GuideMessageFrequencyRule LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuideMessageFrequencyRule guideMessageFrequencyRule = new GuideMessageFrequencyRule();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        guideMessageFrequencyRule.dayShowCount = c1516680pZS.LJIIJJI();
                    }
                } else {
                    guideMessageFrequencyRule.roomShowCount = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guideMessageFrequencyRule;
            }
        }
    }

    @Override // X.C0IMD
    public final GuideMessageFrequencyRule LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GuideMessageFrequencyRule guideMessageFrequencyRule) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuideMessageFrequencyRule guideMessageFrequencyRule, List list) {
    }
}
