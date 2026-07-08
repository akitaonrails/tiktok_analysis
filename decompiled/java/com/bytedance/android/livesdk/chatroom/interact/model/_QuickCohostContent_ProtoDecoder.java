package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuickCohostContent_ProtoDecoder implements C0IMD<QuickCohostContent> {
    public static QuickCohostContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QuickCohostContent quickCohostContent = new QuickCohostContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        quickCohostContent.displayText = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    quickCohostContent.contentId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return quickCohostContent;
            }
        }
    }

    @Override // X.C0IMD
    public final QuickCohostContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(QuickCohostContent quickCohostContent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuickCohostContent quickCohostContent, List list) {
    }
}
