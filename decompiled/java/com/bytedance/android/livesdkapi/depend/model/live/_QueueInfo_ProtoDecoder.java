package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QueueInfo_ProtoDecoder implements C0IMD<QueueInfo> {
    public static QueueInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        QueueInfo queueInfo = new QueueInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        queueInfo.queueId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        queueInfo.status = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        queueInfo.queueTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        queueInfo.memberCount = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        queueInfo.currentUserId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        queueInfo.joinStatus = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return queueInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final QueueInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(QueueInfo queueInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QueueInfo queueInfo, List list) {
    }
}
