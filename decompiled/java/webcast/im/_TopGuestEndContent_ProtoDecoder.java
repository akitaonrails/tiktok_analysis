package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TopGuestEndContent_ProtoDecoder implements C0IMD<TopGuestEndContent> {
    public static TopGuestEndContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TopGuestEndContent topGuestEndContent = new TopGuestEndContent();
        topGuestEndContent.topGuestUserInfo = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            topGuestEndContent.topGuestUserInfo.add(_TopGuestUserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        topGuestEndContent.endReason = c1516680pZS.LJIIJJI();
                    }
                } else {
                    topGuestEndContent.endTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return topGuestEndContent;
            }
        }
    }

    public static void LJ(TopGuestEndContent topGuestEndContent) {
        List<TopGuestUserInfo> list = topGuestEndContent.topGuestUserInfo;
        if (list == null) {
            topGuestEndContent.topGuestUserInfo = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<TopGuestUserInfo> it2 = topGuestEndContent.topGuestUserInfo.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TopGuestEndContent topGuestEndContent) {
        LJ(topGuestEndContent);
    }

    @Override // X.C0IMD
    public final TopGuestEndContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopGuestEndContent topGuestEndContent, List list) {
    }
}
