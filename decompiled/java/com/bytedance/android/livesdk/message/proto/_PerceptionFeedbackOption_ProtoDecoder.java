package com.bytedance.android.livesdk.message.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PerceptionFeedbackOption_ProtoDecoder implements C0IMD<PerceptionFeedbackOption> {
    public static PerceptionFeedbackOption LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PerceptionFeedbackOption perceptionFeedbackOption = new PerceptionFeedbackOption();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        perceptionFeedbackOption.contentKey = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    perceptionFeedbackOption.id = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return perceptionFeedbackOption;
            }
        }
    }

    @Override // X.C0IMD
    public final PerceptionFeedbackOption LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PerceptionFeedbackOption perceptionFeedbackOption) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PerceptionFeedbackOption perceptionFeedbackOption, List list) {
    }
}
