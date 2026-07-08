package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TopliveNoticeExtra_ProtoDecoder implements C0IMD<TopliveNoticeExtra> {
    @Override // X.C0IMD
    public final TopliveNoticeExtra LIZJ(C1516680pZS c1516680pZS) throws IOException {
        TopliveNoticeExtra topliveNoticeExtra = new TopliveNoticeExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            topliveNoticeExtra.now = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        topliveNoticeExtra.unreadCount = c1516680pZS.LJIIJJI();
                    }
                } else {
                    topliveNoticeExtra.hasMore = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return topliveNoticeExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TopliveNoticeExtra topliveNoticeExtra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopliveNoticeExtra topliveNoticeExtra, List list) {
    }
}
