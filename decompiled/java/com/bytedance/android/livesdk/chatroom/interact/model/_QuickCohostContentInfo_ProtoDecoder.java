package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuickCohostContentInfo_ProtoDecoder implements C0IMD<QuickCohostContentInfo> {
    public static QuickCohostContentInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QuickCohostContentInfo quickCohostContentInfo = new QuickCohostContentInfo();
        quickCohostContentInfo.quickCohostContent = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    quickCohostContentInfo.quickCohostContent.add(_QuickCohostContent_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return quickCohostContentInfo;
            }
        }
    }

    public static void LJ(QuickCohostContentInfo quickCohostContentInfo) {
        List<QuickCohostContent> list = quickCohostContentInfo.quickCohostContent;
        if (list == null) {
            quickCohostContentInfo.quickCohostContent = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<QuickCohostContent> it2 = quickCohostContentInfo.quickCohostContent.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(QuickCohostContentInfo quickCohostContentInfo) {
        LJ(quickCohostContentInfo);
    }

    @Override // X.C0IMD
    public final QuickCohostContentInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuickCohostContentInfo quickCohostContentInfo, List list) {
    }
}
