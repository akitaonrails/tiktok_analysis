package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NotifyHighlightInfo_ProtoDecoder implements C0IMD<NotifyHighlightInfo> {
    public static NotifyHighlightInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NotifyHighlightInfo notifyHighlightInfo = new NotifyHighlightInfo();
        notifyHighlightInfo.contents = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        notifyHighlightInfo.color = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    notifyHighlightInfo.contents.add(_NotifyHighlightContent_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return notifyHighlightInfo;
            }
        }
    }

    public static void LJ(NotifyHighlightInfo notifyHighlightInfo) {
        List<NotifyHighlightContent> list = notifyHighlightInfo.contents;
        if (list == null) {
            notifyHighlightInfo.contents = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<NotifyHighlightContent> it2 = notifyHighlightInfo.contents.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(NotifyHighlightInfo notifyHighlightInfo) {
        LJ(notifyHighlightInfo);
    }

    @Override // X.C0IMD
    public final NotifyHighlightInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NotifyHighlightInfo notifyHighlightInfo, List list) {
    }
}
