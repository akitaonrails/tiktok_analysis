package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuideTarget_ProtoDecoder implements C0IMD<GuideTarget> {
    public static GuideTarget LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuideTarget guideTarget = new GuideTarget();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            guideTarget.periodId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        guideTarget.targetType = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    guideTarget.targetId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guideTarget;
            }
        }
    }

    @Override // X.C0IMD
    public final GuideTarget LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GuideTarget guideTarget) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuideTarget guideTarget, List list) {
    }
}
