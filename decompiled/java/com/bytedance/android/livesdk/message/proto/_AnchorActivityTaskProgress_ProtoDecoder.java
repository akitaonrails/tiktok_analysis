package com.bytedance.android.livesdk.message.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorActivityTaskProgress_ProtoDecoder implements C0IMD<AnchorActivityTaskProgress> {
    public static AnchorActivityTaskProgress LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorActivityTaskProgress anchorActivityTaskProgress = new AnchorActivityTaskProgress();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        anchorActivityTaskProgress.taskProgress = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    anchorActivityTaskProgress.taskIconUrl = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorActivityTaskProgress;
            }
        }
    }

    @Override // X.C0IMD
    public final AnchorActivityTaskProgress LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AnchorActivityTaskProgress anchorActivityTaskProgress) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorActivityTaskProgress anchorActivityTaskProgress, List list) {
    }
}
