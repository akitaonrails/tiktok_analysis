package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TopliveNoticeUnreadCountData_ProtoDecoder implements C0IMD<TopliveNoticeUnreadCountData> {
    @Override // X.C0IMD
    public final TopliveNoticeUnreadCountData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        TopliveNoticeUnreadCountData topliveNoticeUnreadCountData = new TopliveNoticeUnreadCountData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    topliveNoticeUnreadCountData.unreadCount = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return topliveNoticeUnreadCountData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TopliveNoticeUnreadCountData topliveNoticeUnreadCountData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopliveNoticeUnreadCountData topliveNoticeUnreadCountData, List list) {
    }
}
