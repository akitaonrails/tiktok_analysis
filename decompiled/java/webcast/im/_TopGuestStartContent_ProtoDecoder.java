package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TopGuestStartContent_ProtoDecoder implements C0IMD<TopGuestStartContent> {
    public static TopGuestStartContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TopGuestStartContent topGuestStartContent = new TopGuestStartContent();
        topGuestStartContent.topGuestUserInfo = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        topGuestStartContent.topGuestUserInfo.add(_TopGuestUserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    topGuestStartContent.startTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return topGuestStartContent;
            }
        }
    }

    public static void LJ(TopGuestStartContent topGuestStartContent) {
        List<TopGuestUserInfo> list = topGuestStartContent.topGuestUserInfo;
        if (list == null) {
            topGuestStartContent.topGuestUserInfo = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<TopGuestUserInfo> it2 = topGuestStartContent.topGuestUserInfo.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TopGuestStartContent topGuestStartContent) {
        LJ(topGuestStartContent);
    }

    @Override // X.C0IMD
    public final TopGuestStartContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopGuestStartContent topGuestStartContent, List list) {
    }
}
