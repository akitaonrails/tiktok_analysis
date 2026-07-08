package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NoticeboardReviewInfo_ProtoDecoder implements C0IMD<NoticeboardReviewInfo> {
    public static NoticeboardReviewInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NoticeboardReviewInfo noticeboardReviewInfo = new NoticeboardReviewInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        noticeboardReviewInfo.reviewStatus = c1516680pZS.LJIIJ();
                    }
                } else {
                    noticeboardReviewInfo.mediaNodeId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return noticeboardReviewInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final NoticeboardReviewInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(NoticeboardReviewInfo noticeboardReviewInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NoticeboardReviewInfo noticeboardReviewInfo, List list) {
    }
}
